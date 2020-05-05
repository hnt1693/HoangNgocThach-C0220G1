select HoTen, count(HopDong.IDKhachHang) as soLanDat
from furama.HopDong
         inner join furama.KhachHang on HopDong.IDKhachHang = KhachHang.IDKhachHang
         inner join furama.LoaiKhach LK on KhachHang.IDLoaiKhach = LK.IDLoaiKhach
where LK.TenLoaiKhach = 'Diamond'
group by HoTen
order by HoTen desc;