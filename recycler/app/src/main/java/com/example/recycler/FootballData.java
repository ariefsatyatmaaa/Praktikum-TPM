package com.example.recycler;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"Aphrodite","Apollo","Ares",
            "Artemis","Athena","Hades","Hera","Hermes","Poseidon","Zeus"};

    private static int[] thumbnail = new
            int[]{R.drawable.aphrodite,R.drawable.apollo,
            R.drawable.ares,R.drawable.artemis,R.drawable.athena,R.drawable.hades,
            R.drawable.hera,R.drawable.hermes,R.drawable.poseidon,R.drawable.zeus};


    private static String[] preview = new String[]{
            "Kecantikan memang tak selalu berjalan beriringan dengan kebaikan hati. Aphrodite adalah contohnya.\n" +
                    "\n" +
                    "Sebagai dewi kecantikan sekaligus nafsu dan sensualitas, Afrodite menjadi incaran banyak orang. Namun justru Hefaistos, seorang pandai besi cacat yang menjadi suaminya.\n" +
                    "\n" +
                    "Tetapi dikisahkan ternyata dibelakang Hefaistos, Aphrodite sering bercinta dengan Ares diam-diam. Sebagai insinyur para dewa yang menciptakan alat-alat canggih, Hefaistos menjebak keduanya dengan jala yang tak terlihat.\n" +
                    "\n" +
                    "Ketika Ares dan Aphrodite bercinta, mereka terjebak dalam jaring. Hefaistos lalu memangil para dewa lainnya untuk mempermalukan mereka berdua. Ares yang adalah dewa perang kemudian malu dan mengasingkan diri.",

            "Apolo adalah anak dari Zeus dengan Leto. Jadi, ia merupakan saudara kembar Artemis.  Apolo adalah dewa kebijaksanaan, kecerdasan, musik dan ramalan. Dia merupakan pelindung para peramal kuno. ",

            "Ares adalah simbol maskulinitas sekaligus bad boy parah. Sebagai dewa perang, memang Ares suka bikin onar dan gemar kekerasan.\n" +
                    "\n" +
                    "Dia memiliki hewan kesukaan berupa anjing. Dua pengawal setianya adalah Deimos dan Phobos. Arti dari keduanya dalam Bahasa Indonesia adalah teror dan ketakutan.\n" +
                    "\n" +
                    "Ares adalah anak Zeus dari Hera. Dia bermusuhan dengan Athena, walau mereka sebenarnya bersaudara.\n" +
                    "\n" +
                    "Dia sering digambarkan sebagai seorang pria muda dengan baju zirah dan tombak emas.\n" +
                    "\n" +
                    "Eros punya banyak pasangan tetapi yang paling terkenal adalah hubungan cintanya dengan Aphrodite, dewi tercantik yang pernah ada. Padahal Aphrodite sudah bersuami.",

            "Dikenal sebagai dewi keperawanan, kesuburan dan pelindung para pemburu, Artemis banyak dipuja oleh masyarakat Yunani dan sekitarnya. Dia juga merupakan salah satu pelindung Sparta.\n" +
                    "\n" +
                    "Pada masa lalu, kesuburan merupakan aspek yang sangat penting. Oleh karena itu tak heran jika Artemis mendapat pemujaan yang luas.\n" +
                    "\n" +
                    "Di beberapa tempat, Artemis disimbolkan melalui patung seorang wanita cantik dengan banyak payudara.\n",

                    "Athena adalah anak Zeus dari Metis.  Dikenal sebagai Dewi Kebijaksanaan dan pelindung kota-kota Yunani, Athena merupakan salah satu figur yang paling banyak disembah disamping Zeus.\n" +
                            "\n" +
                            "Dia dikenal sebagai ahli strategi dan menjadi salah satu pelindung terkuat para pahlawan Yunani.\n" +
                            "\n" +
                            "Selain oleh Yunani, bangsa Romawi juga memuja Athena. Mereka menyubutnya dengan nama Dewi Minerva.\n",

            "Hades merupakan dewa penguasa alam baka. Sebagai saudara Zeus, dia justru disingkarkan dari Olimpus melalui sebuah permainan dadu.\n" +
                    "\n" +
                    "Selain oleh orang Yunani, bangsa Romawi juga memujanya dengan nama Pluto. Dia memiliki banyak pengawal mengerikan sekaligus bertanggung jawab atas dunia kematian.\n",

            "Hera mewakili perasaan para istri yang tercabik-cabik karena punya suami hebat dan berkuasa namun doyan selingkuh.\n" +
                    "\n" +
                    "Sebagai istri Zeus, Hera memang berkali-kali korban perasaan. Itu sebabnya dia jadi suka berbuat jahat pada manusia, khususnya mereka yang ditaksir oleh suaminya. Salah satu musuh abadinya adalah Herkules, salah satu anak Zeus dari manusia.\n" +
                    "\n" +
                    "Hera sendiri dikenal sebagai dewi pelindung wanita dan pernikahan. Jika ingin selamat dari Hera, maka jangan coba-coba selingkuh.\n",

                    "Hermes adalah dewa tampan yang bertugas membawa pesan dari langit untuk para manusia terpilih. Ia merupakan anak Zeus dengan salah satu kekasihnya, Maia.\n" +
                            "\n" +
            "Hermes digambarkan sebagai pria muda dengan sandal bersayap dan topi imut mirip kurcaci.\n" +
                    "\n" +
                    "Dalam kronik Troya Hermes dikisahkan membantu Priam untuk bertemu Achiles dan membujuk ksatria bengis Yunani itu agar mau mengembalikan mayat anaknya, Hector.",

            "Sebenarnya Poseidon masih saudara dengan Zeus, bahkan ia adalah kakak dari Zeus dan Hades. Namun apes, ketika undian dia cuma dapat laut dan samudera.\n" +
                    "\n" +
                    "Sebagai dewa penguasa lautan, Poseidon menikmati pemujaan dari banyak orang di masa lalu, khususnya pedagang dan pelaut yang memohon keselamatan ketika berlayar.\n" +
                    "\n" +
                    "Senjata utama Poseidon adalah sebuah trisula sakti yang mampu menghancurkan musuh dengan mudah. Hewan kesayangannya adalah lumba-lumba.\n",

                    "Jadi ceritanya Zeus adalah dewa tertinggi dalam mitologi Yunani. Dia memiliki kekuatan yang dahsyat serta hidup abadi. Siapa sangka jika rajanya para dewa ini sebenarnya berasal dari keluarga broken home, bahkan nyaris dibunuh oleh bapaknya sendiri?\n" +
                    "\n" +
                    "Ya, Zeus adalah putra dari Kronos dan Rea. Keduanya merupakan dewa super kuno yang masuk dalam golongan Titan.\n" +
                    "\n" +
                    "Kronos takut nanti anaknya akan membunuhnya, maka dia mengambil sebuah keputusan gila, memakan anak-anaknya sendiri.\n" +
                    "\n" +
                    "Zeus selamat karena ditolong ibunya. Ternyata bukan hanya di dunia manusia, di dunia dewa, kasih ibu memang tiada dunia.\n" +
                    "\n" +
                    "Ketika dewasa, dibantu oleh teman-temannya, Zeus menyerang Kronos dan para Titan lainnya. Ia juga berhasil mengembalikan saudara-saudaranya yang semasa kecil dimangsa bapaknya.\n" +
                            "\n" +
                            "Setelah berhasil mengalahkan Kronos, jadilah Zeus penerus estafet kerajaan berikutnya, menjadi rajanya para dewa."
    };

    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            footballModel.setPrivew(preview[i]);
            list.add(footballModel);
        }
        return list;
    }
}

