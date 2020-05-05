select month(furama.HopDong.NgayLamHopDong)as Thang, count(furama.HopDong.IDDichVu) as soLuongHD from furama.HopDong
where year(HopDong.NgayLamHopDong)=2019
group by month(NgayLamHopDong)