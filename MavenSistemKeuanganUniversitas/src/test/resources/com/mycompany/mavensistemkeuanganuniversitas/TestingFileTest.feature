# language: id

    Fitur: Cek Status Pebayaran Mahasiswa
           Mengelola Data Status Pembayaran Mahasiswa

           @Normal
           Skenario: Cek Status Pembayaran Lunas
		Dengan Nim yang diinputkan pada kolom cek status pada menu cek status pembayaran mahasiswa
		Ketika Cek status pembayaran dengan nim "1301154424"
		Maka respon sistem lunas "Status Pembayaran Lunas"

           @Gagal
           Skenario: Cek Status Pembayaran Belum Lunas
		Dengan Nim yang diinputkan pada kolom cek status pada menu cek status pembayaran mahasiswa
		Ketika Cek status pembayaran dengan nim "1301152424"
		Maka respon sistem belum lunas "Segera Lakukan Pembayaran"
