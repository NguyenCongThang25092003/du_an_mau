package views;

import domainmodels.ChiTietSP;
import domainmodels.GioHang;
import domainmodels.GioHangChiTiet;
import domainmodels.HoaDon;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.ChiTietSPService;
import services.GioHangChiTietService;
import services.GioHangService;
import services.impl.ChiTietSPServiceImpl;
import services.HoaDonChiTietService;
import services.impl.HoaDonChiTietServiceImpl;
import services.HoaDonService;
import services.impl.GioHangChiTietServiceImpl;
import services.impl.GioHangServiceImpl;
import services.impl.HoaDonServiceImpl;
import viewmodels.HoaDonChiTietResponse;
import utillies.ValidationUtil;
import viewmodels.ChiTietSPResponse;
import viewmodels.GioHangChiTietResponse;
import viewmodels.HoaDonResponse;

public class FpolyShop extends javax.swing.JFrame {

    private final DefaultTableModel modelSanPham;
    private final DefaultTableModel modelGioHang;
    private final DefaultTableModel modelHoaDon;
    private final ChiTietSPService sanPhamService;
    private final HoaDonService hoaDonService;
    private final GioHangService gioHangService;
    private final HoaDonChiTietService hoaDonChiTietService;
    private final GioHangChiTietService gioHangChiTietService;
    private final ChiTietSPService chiTietSPService;
    private List<ChiTietSPResponse> listSanPhamResponse;
    private Map<UUID, GioHangChiTietResponse> listGioHang;
    private List<HoaDonResponse> listHoaDonResponse;

    public FpolyShop() {
        initComponents();
        setLocationRelativeTo(null);
        this.modelSanPham = (DefaultTableModel) tblSanPham.getModel();
        this.modelGioHang = (DefaultTableModel) tblGioHang.getModel();
        this.modelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
        this.sanPhamService = new ChiTietSPServiceImpl();
        this.hoaDonService = new HoaDonServiceImpl();
        this.gioHangService = new GioHangServiceImpl();
        this.hoaDonChiTietService = new HoaDonChiTietServiceImpl();
        this.gioHangChiTietService = new GioHangChiTietServiceImpl();
        this.chiTietSPService = new ChiTietSPServiceImpl();
        this.listSanPhamResponse = new ArrayList<>();
        this.listHoaDonResponse = new ArrayList<>();
        this.listGioHang = new HashMap<>();
        this.listHoaDonResponse = this.hoaDonService.getAll("");
        loadDataChiTietSP();
        loadDataHoaDon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PoMenu = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnTaoHoaDon = new javax.swing.JButton();
        rdoChoThanhToan = new javax.swing.JRadioButton();
        rdoTatCa = new javax.swing.JRadioButton();
        rdoDaHuy = new javax.swing.JRadioButton();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtTienKhachDua = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FpolyShop");

        tblHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HD", "Ngày tạo", "Tên NV", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setRowHeight(30);
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.getTableHeader().setReorderingAllowed(false);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);
        tblHoaDon.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblHoaDon.getColumnModel().getColumn(1).setPreferredWidth(35);
        tblHoaDon.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblHoaDon.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblHoaDon.getColumnModel().getColumn(4).setPreferredWidth(90);

        btnTaoHoaDon.setBackground(new java.awt.Color(204, 204, 255));
        btnTaoHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTaoHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoHoaDon.setIcon(new javax.swing.ImageIcon("D:\\dowload\\insert.png")); // NOI18N
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        rdoChoThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChoThanhToan);
        rdoChoThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoChoThanhToan.setText("Chờ thanh toán");
        rdoChoThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoChoThanhToanMouseClicked(evt);
            }
        });

        rdoTatCa.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoTatCa);
        rdoTatCa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoTatCa.setSelected(true);
        rdoTatCa.setText("Tất cả");
        rdoTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoTatCaMouseClicked(evt);
            }
        });

        rdoDaHuy.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoDaHuy);
        rdoDaHuy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoDaHuy.setText("Đã hủy");
        rdoDaHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoDaHuyMouseClicked(evt);
            }
        });

        rdoDaThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoDaThanhToan);
        rdoDaThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoDaThanhToan.setText("Đã thanh toán");
        rdoDaThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoDaThanhToanMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mã HD");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ngày tạo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên NV");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tổng tiền");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tiền khách đưa");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Tiền thừa");

        txtMaHD.setEditable(false);
        txtMaHD.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtMaHD.setForeground(new java.awt.Color(255, 102, 0));

        txtNgayTao.setEditable(false);
        txtNgayTao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTenNV.setEditable(false);
        txtTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(255, 0, 0));

        txtTienKhachDua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTienKhachDua.setEnabled(false);
        txtTienKhachDua.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienKhachDuaCaretUpdate(evt);
            }
        });
        txtTienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyReleased(evt);
            }
        });

        txtTienThua.setEditable(false);
        txtTienThua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnThanhToan.setBackground(new java.awt.Color(153, 204, 255));
        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setIcon(new javax.swing.ImageIcon("D:\\dowload\\debit-card.png")); // NOI18N
        btnThanhToan.setEnabled(false);
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhToan)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Giỏ hàng"));

        jScrollPane3.setForeground(new java.awt.Color(255, 102, 102));

        tblGioHang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGioHang.setRowHeight(30);
        tblGioHang.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGioHang.getTableHeader().setReorderingAllowed(false);
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        tblGioHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGioHangKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblGioHang);
        tblGioHang.getColumnModel().getColumn(0).setPreferredWidth(27);
        tblGioHang.getColumnModel().getColumn(1).setPreferredWidth(45);
        tblGioHang.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblGioHang.getColumnModel().getColumn(3).setPreferredWidth(40);
        tblGioHang.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblGioHang.getColumnModel().getColumn(5).setPreferredWidth(100);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm"));

        tblSanPham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Năm BH", "Mô tả", "SL SP", "Giá nhập", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setRowHeight(35);
        tblSanPham.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSanPham.getTableHeader().setReorderingAllowed(false);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);
        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(27);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(45);
        tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblSanPham.getColumnModel().getColumn(3).setPreferredWidth(30);
        tblSanPham.getColumnModel().getColumn(4).setPreferredWidth(45);
        tblSanPham.getColumnModel().getColumn(5).setPreferredWidth(40);
        tblSanPham.getColumnModel().getColumn(6).setPreferredWidth(40);
        tblSanPham.getColumnModel().getColumn(7).setPreferredWidth(40);

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\dowload\\exit.png")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\ImagesDemo\\clear.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaoHoaDon)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoChoThanhToan)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoTatCa)
                                        .addGap(30, 30, 30)
                                        .addComponent(rdoDaHuy)
                                        .addGap(27, 27, 27)
                                        .addComponent(rdoDaThanhToan))
                                    .addComponent(jScrollPane1)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTaoHoaDon, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoChoThanhToan)
                            .addComponent(rdoTatCa)
                            .addComponent(rdoDaHuy)
                            .addComponent(rdoDaThanhToan))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTaoHoaDon, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        try {
            loadDataChiTietSP();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        try {
            int index = tblSanPham.getSelectedRow();
            int indexTblHoaDon = tblHoaDon.getSelectedRow();
            ChiTietSPResponse chiTietSPResponse = this.listSanPhamResponse.get(index);
            if (indexTblHoaDon == -1) {
                JOptionPane.showMessageDialog(this, "Mời chọn hóa đơn !!!!!!!!!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }
            HoaDonResponse hoaDonResponse = this.listHoaDonResponse.get(indexTblHoaDon);
            GioHang gioHang = this.gioHangService.findByMa(hoaDonResponse.getMaHD());
            if (hoaDonResponse.getTinhTrang() == 2) {
                JOptionPane.showMessageDialog(this, "Hóa đơn đã thanh toán");
                return;
            }
            GioHangChiTietResponse gioHangChiTietCheck = this.listGioHang.get(chiTietSPResponse.getIdChiTietSP());
            int soLuongThayDoi = 0;
            if (gioHangChiTietCheck != null) {
                Object[] options = {"Thêm số lượng", "Giảm số lượng", "Hủy"};
                int result = JOptionPane.showOptionDialog(this,
                        "Sản phẩm này đã có trong giỏ hàng, bạn muốn gì?",
                        "Xác nhận",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[2]);
                if (result == 0 || result == 1) {
                    String soLuongThayDoiStr = JOptionPane.showInputDialog(this, "Nhập số lượng: ");
                    if (soLuongThayDoiStr == null) {
                        return;
                    }
                    try {
                        soLuongThayDoi = Integer.parseInt(soLuongThayDoiStr);
                        if (soLuongThayDoi < 0) {
                            JOptionPane.showMessageDialog(this, "Số lượng không thể âm");
                            return;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                        return;
                    }
                    if (result == 0) {
                        if (soLuongThayDoi > chiTietSPResponse.getSoLuongSP() - gioHangChiTietCheck.getSoLuongSP()) {
                            JOptionPane.showMessageDialog(this, "Không được vượt số lượng tồn");
                            return;
                        }
                        soLuongThayDoi = soLuongThayDoi;
                    } else {
                        if (soLuongThayDoi > gioHangChiTietCheck.getSoLuongSP()) {
                            JOptionPane.showMessageDialog(this, "Số lượng sau khi giảm không được âm");
                            return;
                        }
                        if (soLuongThayDoi == gioHangChiTietCheck.getSoLuongSP()) {
                            listGioHang.remove(gioHangChiTietCheck.getIdChiTietSP());
                            loadDataGioHang();
                        }
                        soLuongThayDoi = -soLuongThayDoi;
                    }
                }
            }
            if (gioHangChiTietCheck == null) {
                String inputSoLuong = JOptionPane.showInputDialog(this, "Nhập số lượng", "0");
                if (inputSoLuong == null) {
                    return;
                }
                int soLuong;
                try {
                    soLuong = Integer.parseInt(inputSoLuong);
                    if (soLuong < 0 || soLuong > chiTietSPResponse.getSoLuongSP()) {
                        JOptionPane.showMessageDialog(this, "Số lượng không được âm, không lớn hơn số lượng tồn");
                        return;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                    return;
                }
                if (soLuong == 0) {
                    return;
                }
                GioHangChiTietResponse gioHangChiTietResponse = new GioHangChiTietResponse();
                gioHangChiTietResponse.setIdChiTietSP(chiTietSPResponse.getIdChiTietSP());
                gioHangChiTietResponse.setIdGioHang(gioHang.getId());
                gioHangChiTietResponse.setMaSP(chiTietSPResponse.getMaSP());
                gioHangChiTietResponse.setTenSP(chiTietSPResponse.getTenSP());
                gioHangChiTietResponse.setSoLuongSP(soLuong);
                gioHangChiTietResponse.setGiaBan(chiTietSPResponse.getGiaBan());
                this.listGioHang.put(gioHangChiTietResponse.getIdChiTietSP(), gioHangChiTietResponse);
                GioHangChiTiet gioHangChiTiet = gioHangChiTietService.convertGioHangChiTiet(gioHangChiTietResponse);
                this.gioHangChiTietService.saveOrUpdate(gioHangChiTiet);
                loadDataGioHang();
            } else {
                gioHangChiTietCheck.setSoLuongSP(gioHangChiTietCheck.getSoLuongSP() + soLuongThayDoi);
                this.listGioHang.replace(gioHangChiTietCheck.getIdChiTietSP(), gioHangChiTietCheck);
                List<GioHangChiTiet> listGioHangChiTiet = gioHangChiTietService.converListGioHangChiTiet(listGioHang);
                this.gioHangChiTietService.saveAll(listGioHangChiTiet);
                loadDataGioHang();
            }
            tinhTongTien();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblGioHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGioHangKeyReleased
    }//GEN-LAST:event_tblGioHangKeyReleased
    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        try {
            int index = tblGioHang.getSelectedRow();
            int indexTblHoaDon = tblHoaDon.getSelectedRow();
            if (indexTblHoaDon >= 0) {
                HoaDonResponse hoaDonResponse = listHoaDonResponse.get(indexTblHoaDon);
                if (hoaDonResponse.getTinhTrang() == 0 || hoaDonResponse.getTinhTrang() == 2) {
                    JOptionPane.showMessageDialog(this, "Hóa đơn đã thanh toán hoặc đã hủy");
                    return;
                }
            }
            GioHangChiTietResponse gioHangChiTietResponse = null;
            if (index >= 0) {
                gioHangChiTietResponse = new ArrayList<>(listGioHang.values()).get(index);
            }
            int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này không?");
            if (result != JOptionPane.YES_OPTION) {
                return;
            }
            ChiTietSP chiTietSP = new ChiTietSP();
            chiTietSP.setId(gioHangChiTietResponse.getIdChiTietSP());
            GioHang gioHang = new GioHang();
            gioHang.setId(gioHangChiTietResponse.getIdGioHang());
            GioHangChiTiet gioHangChiTiet = new GioHangChiTiet();
            gioHangChiTiet.setIdChiTietSP(chiTietSP);
            gioHangChiTiet.setIdGioHang(gioHang);
            boolean check = this.gioHangChiTietService.delete(gioHangChiTiet);
            if (check) {
                listGioHang.remove(gioHangChiTietResponse.getIdChiTietSP());
            }
            loadDataGioHang();
            tinhTongTien();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblGioHangMouseClicked

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        try {
            clearTblGioHang();
            clearFormHoaDon();

            HoaDon hoaDon = new HoaDon();
            int maHoaDon = this.hoaDonService.genMaHoaDon();
            hoaDon.setMa("HD" + maHoaDon);
            hoaDon.setNgayTao(new Date());
            hoaDon.setTinhTrang(1);

            String message = this.hoaDonService.insert(hoaDon);
            JOptionPane.showMessageDialog(this, message);
            GioHang gioHang = new GioHang();
            gioHang.setMa(hoaDon.getMa());
            gioHang.setNgayTao(hoaDon.getNgayTao());
            gioHang.setTinhTrang(hoaDon.getTinhTrang());
            gioHang = gioHangService.save(gioHang);
            this.listHoaDonResponse = this.hoaDonService.getAll(getRdoTrangThai());
            loadDataHoaDon();

            tblHoaDon.setRowSelectionInterval(0, 0);
            txtTienKhachDua.setEnabled(true);
            showDetailHoaDon(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        try {
            clearFormHoaDon();
            clearTblGioHang();
            int row = tblHoaDon.getSelectedRow();
            showDetailHoaDon(row);
            HoaDonResponse hoaDonResponse = this.listHoaDonResponse.get(row);
            if (hoaDonResponse.getTinhTrang() == 2 || hoaDonResponse.getTinhTrang() == 0) {
                List<HoaDonChiTietResponse> listHoaDonChiTietResponse = this.hoaDonChiTietService.getListHoaDonChiTietTheoIdHoaDon(hoaDonResponse.getId());
                loadDataHoaDonChiTiet(listHoaDonChiTietResponse);
                txtTienKhachDua.setEnabled(false);
                btnThanhToan.setEnabled(false);
            } else {
                GioHang gioHang = gioHangService.findByMa(hoaDonResponse.getMaHD());
                List<GioHangChiTietResponse> listGioHangChiTietResponse = gioHangChiTietService.getListGioHangChiTietTheoMaHoaDon(hoaDonResponse.getMaHD());
                listGioHang = gioHangChiTietService.convertToGioHangChiTiet(gioHang.getId(), listGioHangChiTietResponse);
                loadDataGioHang();
                txtTienKhachDua.setEnabled(true);
                btnThanhToan.setEnabled(true);
            }
            tinhTongTien();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtTienKhachDuaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienKhachDuaCaretUpdate

    }//GEN-LAST:event_txtTienKhachDuaCaretUpdate

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        try {
            if (ValidationUtil.checkEmpty(txtTongTien, "Chưa có sản phẩm !!!")) {
                return;
            }
            if (tblGioHang.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Chưa có sản phẩm !!!");
                return;
            }
            if (ValidationUtil.checkEmpty(txtTienKhachDua, "Nhập tiền khách đưa !!!")) {
                return;
            }
            BigDecimal tienKhachDua = null;
            BigDecimal tongTien = null;
            try {
                tienKhachDua = new BigDecimal(txtTienKhachDua.getText().trim());
                tongTien = new BigDecimal(txtTongTien.getText().trim().replace(",", ""));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền phải là số");
                return;
            }
            if (tienKhachDua.compareTo(tongTien) == -1) {
                JOptionPane.showMessageDialog(this, "Thanh toán thất bại vì tiền khách đưa chưa đủ");
                return;
            }
            int indexHoaDon = tblHoaDon.getSelectedRow();
            HoaDonResponse hoaDonResponse = this.listHoaDonResponse.get(indexHoaDon);

            this.hoaDonChiTietService.insert(hoaDonResponse.getId(), this.listGioHang);
            this.chiTietSPService.updateSoLuong(this.listGioHang);
            this.hoaDonService.updateTrangThaiHoaDon(hoaDonResponse.getId());
            this.gioHangChiTietService.deleteByMaGioHang(hoaDonResponse.getMaHD());
            this.gioHangService.deleteByMa(hoaDonResponse.getMaHD());

            loadDataChiTietSP();
            this.listHoaDonResponse = this.hoaDonService.getAll(getRdoTrangThai());
            loadDataHoaDon();
            clearFormHoaDon();
            clearTblGioHang();
            JOptionPane.showMessageDialog(this, "Thanh toán thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtTienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyReleased
        if (ValidationUtil.checkEmpty(txtTongTien, "Chưa có sản phẩm !!!")) {
            return;
        }
        BigDecimal tienKhachDua = new BigDecimal(0);
        if (txtTienKhachDua.getText().trim().isEmpty() || tblGioHang.getRowCount() == 0) {
            tienKhachDua = new BigDecimal(0);
            JOptionPane.showMessageDialog(this, "Chưa có sản phẩm");
            return;
        } else {
            if (ValidationUtil.checkIsNumberForBigDecimal(txtTienKhachDua, "Vui lòng nhập số")) {
                btnThanhToan.setEnabled(false);
                txtTienThua.setText("0");
                return;
            }
            tienKhachDua = new BigDecimal(txtTienKhachDua.getText().trim());
        }
        BigDecimal tongTien = new BigDecimal(txtTongTien.getText().trim().replace(",", ""));
        BigDecimal tienThua = tienKhachDua.subtract(tongTien);
        if (tienThua.compareTo(BigDecimal.ZERO) == -1) {
            txtTienThua.setText("0");
            btnThanhToan.setEnabled(false);
        } else {
            btnThanhToan.setEnabled(true);
            DecimalFormat df = new DecimalFormat("#,###");
            txtTienThua.setText(df.format(tienThua));
        }
    }//GEN-LAST:event_txtTienKhachDuaKeyReleased

    private void rdoTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoTatCaMouseClicked
        try {
            clearFormHoaDon();
            clearTblGioHang();
            this.listHoaDonResponse = this.hoaDonService.getAll("");
            loadDataHoaDon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rdoTatCaMouseClicked

    private void rdoDaThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoDaThanhToanMouseClicked
        try {
            clearFormHoaDon();
            clearTblGioHang();
            this.listHoaDonResponse = this.hoaDonService.getAll("2");
            loadDataHoaDon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rdoDaThanhToanMouseClicked

    private void rdoChoThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoChoThanhToanMouseClicked
        try {
            clearFormHoaDon();
            clearTblGioHang();
            this.listHoaDonResponse = this.hoaDonService.getAll("1");
            loadDataHoaDon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rdoChoThanhToanMouseClicked

    private void rdoDaHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoDaHuyMouseClicked
        try {
            clearFormHoaDon();
            clearTblGioHang();
            this.listHoaDonResponse = this.hoaDonService.getAll("0");
            loadDataHoaDon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rdoDaHuyMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát không?", "Thoát chương trình", JOptionPane.INFORMATION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void loadDataChiTietSP() {
        this.modelSanPham.setRowCount(0);
        int index = 1;
        this.listSanPhamResponse = this.sanPhamService.getAll(txtTimKiem.getText());
        for (ChiTietSPResponse xx : this.listSanPhamResponse) {
            this.modelSanPham.addRow(xx.toDataRow(index));
            index++;
        }
    }

    private void loadDataHoaDon() {
        this.modelHoaDon.setRowCount(0);
        int index = 1;
        for (HoaDonResponse xx : this.listHoaDonResponse) {
            this.modelHoaDon.addRow(xx.toDataRow(index));
            index++;
        }
    }

    private void loadDataGioHang() {
        this.modelGioHang.setRowCount(0);
        int index = 1;
        for (Map.Entry<UUID, GioHangChiTietResponse> entry : this.listGioHang.entrySet()) {
            GioHangChiTietResponse value = entry.getValue();
            this.modelGioHang.addRow(value.toDataRow(index));
            index++;
        }
    }

    private void loadDataHoaDonChiTiet(List<HoaDonChiTietResponse> list) {
        this.modelGioHang.setRowCount(0);
        int index = 1;
        for (HoaDonChiTietResponse xx : list) {
            this.modelGioHang.addRow(xx.toDataRow(index));
            index++;
        }
    }

    private void tinhTongTien() {
        try {
            int size = tblGioHang.getRowCount();
            BigDecimal tong = new BigDecimal(0);
            for (int i = 0; i < size; i++) {
                BigDecimal money = new BigDecimal(tblGioHang.getValueAt(i, 5).toString());
                tong = tong.add(money);
            }
            DecimalFormat df = new DecimalFormat("#,###");
            txtTongTien.setText(df.format(tong));
            if (txtTienKhachDua.getText().trim().isEmpty()) {
                return;
            }
            BigDecimal tienKhachDua = new BigDecimal(txtTienKhachDua.getText().trim());
            BigDecimal tienThua = null;
            tienThua = tienKhachDua.subtract(tong);
            if (tienThua.compareTo(BigDecimal.ZERO) == -1) {
                txtTienThua.setText("0");
            } else {
                txtTienThua.setText(df.format(tienThua));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showDetailHoaDon(int index) {
        txtMaHD.setText(tblHoaDon.getValueAt(index, 1) + "");
        txtTenNV.setText(tblHoaDon.getValueAt(index, 3) + "");
        txtNgayTao.setText(tblHoaDon.getValueAt(index, 2) + "");
    }

    private void clearTblGioHang() {
        this.listGioHang.clear();
        this.modelGioHang.setRowCount(0);
    }

    private void clearFormHoaDon() {
        txtMaHD.setText("");
        txtNgayTao.setText("");
        txtTenNV.setText("");
        txtTienKhachDua.setText("");
        txtTienThua.setText("");
        txtTongTien.setText("");
    }

    private String getRdoTrangThai() {
        if (rdoChoThanhToan.isSelected()) {
            return "1";
        } else if (rdoDaHuy.isSelected()) {
            return "0";
        } else if (rdoDaThanhToan.isSelected()) {
            return "2";
        } else {
            return "";
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FpolyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FpolyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FpolyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FpolyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FpolyShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PoMenu;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoChoThanhToan;
    private javax.swing.JRadioButton rdoDaHuy;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JRadioButton rdoTatCa;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

}
