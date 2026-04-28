# [Platinum II] Avangardni Autocorrect - 26293

[문제 링크](https://www.acmicpc.net/problem/26293)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 트리, 트라이

### 문제 설명

<p>Filip i Luka svrhu života prona&scaron;li su u jednoj Whatsapp grupi. Iako im je obojici cilj zabaviti ostatak grupe njihove tehnike su nadasve drugačije.</p>

<p>Filip je proračunat tip kojem je svaka poruka promi&scaron;ljena i obično izmami osmjeh barem jednog drugog člana grupe, a nekad se i sam sebi smije.</p>

<p>Luka je s druge strane veoma elokventan i načitan me&scaron;tar kojem je taktika prepričati jako puno zgoda i nezgoda i time zabaviti ekipu tehnikom zvanom <em>poistovječivanje sa situacijama</em>.</p>

<p>Luka može natipkati samo 60ak riječi po minuti pa nekad ne može u potpunosti utilizirati svoju tehniku. Stoga je odlučio skinuti najavangardniju verziju autocorrecta koju iPhone ima u ponudi.</p>

<p>Lukin autocorrect ima rječnik s n riječi koje su poredane po učestalosti kori&scaron;tenosti. Kada god Luka tipka neku riječ Lukin autocrrect predloži najučestaliju riječ koja počinje sa svim slovima dosad napisanim (ako takva postoji). Pritiskom tipke &rsquo;tab&rsquo; Luka može predloženu riječ dovr&scaron;iti i ako treba može nastaviti dalje pisati. Autocorrect se može koristiti tek kada je barem jedno slovo napisano.</p>

<p>Luka želi natipkati poruku od m riječi. Za svaku riječ zanima ga koliko najmanje pritisaka tipki treba da ju napi&scaron;e. Osim tipke &rsquo;<strong>tab</strong>&rsquo; Luka može koristiti <strong>backspace</strong> te tipke za <strong>svako pojedino slovo</strong>.</p>

<p>Pomozite Luki izračuniti koliko najmanje tipki mora pritisnuti za svaku riječ koju želi napisati.</p>

### 입력

<p>U prvom retku nalazi se prirodni brojevi n (1 &le; n &le; 100 000) i m (1 &le; m &le; 100 000) iz teksta zadatka.</p>

<p>U sljedećih n redaka nalaze se riječi koje autocorrect poznaje, redom po učestalosti (najučestalija riječ je navedena prva).</p>

<p>Zatim, u sljedećih m redaka nalaze se riječi koje Luka želi natipkati u poruci.</p>

<p>Sve riječi su sastavljene od malih slova engleske abecede. Ulazni podaci će biti takvi da je njihova datoteka manja od 1 MB.</p>

### 출력

<p>U svaki od sljedećih m redaka ispi&scaron;ite najmanji broj pritisaka koji luka treba da napi&scaron;e pojedinu riječ iz poruke.</p>