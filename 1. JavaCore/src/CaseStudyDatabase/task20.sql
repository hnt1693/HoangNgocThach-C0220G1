select IDNhanVien as ID,HoTen, Email,SDT,NgaySinh,DiaChi from furama.NhanVien
union  (select IDKhachHang as ABC,HoTen,Email,SDT,NgaySinh,DiaChi from furama.KhachHang)