select furama.KhachHang.IDKhachHang,
       furama.KhachHang.HoTen,
       furama.LoaiKhach.TenLoaiKhach,
       furama.HopDong.IDHopDong,
       furama.DichVu.TenDichVu,
       furama.HopDong.NgayLamHopDong,
       furama.HopDong.NgayKetThuc,
       (furama.DichVu.ChiPhiThue + furama.DichVuDiKem.Gia* furama.HopDongChiTiet.SoLuong) as TongTien
from furama.KhachHang
         left join furama.LoaiKhach LK on KhachHang.IDLoaiKhach = LK.IDLoaiKhach
         left join furama.HopDong HD on KhachHang.IDKhachHang = HD.IDKhachHang
         left join furama.DichVu DV on HD.IDDichVu = DV.IDDichVu
         left join furama.HopDongChiTiet HDCT on HD.IDHopDong = HDCT.IDHopDong
         left join furama.DichVuDiKem on HDCT.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem;
