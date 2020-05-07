update furama.KhachHang join (Select HoTen, sum(TongTien)
                       from furama.KhachHang
                                join furama.HopDong HD on KhachHang.IDKhachHang = HD.IDKhachHang
                                join furama.LoaiKhach LK on KhachHang.IDLoaiKhach = LK.IDLoaiKhach
                       where year(NgayLamHopDong) = 2019
                         and TenLoaiKhach = 'Platium'
                       group by KhachHang.IDKhachHang
                       having sum(TongTien) > 10000000) as temp on temp.HoTen = KhachHang.HoTen
set IDLoaiKhach = 1
where temp.HoTen = KhachHang.HoTen