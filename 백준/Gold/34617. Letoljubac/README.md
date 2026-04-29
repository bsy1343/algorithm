# [Gold IV] Letoljubac - 34617

[문제 링크](https://www.acmicpc.net/problem/34617)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Nije neka tajna da Morana voli putovati. Ipak, mala (ne iznenađujuća) tajna je da je Morana veliki letoljubac. Letoljupcima zovemo ljude koji vole letjeti avionom. Ah ti oblaci, ah to nebo! Ima nešto u tome.</p>

<p>Za svoj idući rođendan, Morana je odlučila udovoljiti letoljupcu u sebi i otići na <strong>što više letova</strong> moguće između Zagreba i Pariza. Da bi izbjegla komplikacije, letjeti će samo direktnim linijama između ta $2$ grada. Ona je već našla listu od n letova koji voze taj dan samo direktno između ta $2$ grada, te za svaki let zapisala smjer u kojem ide (ide li iz Pariza prema Zagrebu ili obrnuto), vrijeme polaska (u milisekundama od početka dana), trajanje leta u milisekundama i cijenu leta. (<em>Morana voli biti jako precizna u svojim planovima!</em>)</p>

<p>Kako je ona zauzeta pripremanjem svog rođendanskog tuluma za dan poslije, pita vas za pomoć. Ako Morana kreće iz Zagreba i nije joj bitno u kojem gradu od dva će završiti na kraju, na koliko najviše letova može otići taj dan i koliko će ju to koštati? Ako postoji više opcija, Morana će izabrat najjeftiniju opciju.</p>

<p>Morana će se naizmjenice voziti iz Zagreba prema Parizu, tj. ne može sjesti na let koji ide prema Parizu, ako se trenutno nalazi u Parizu. Također, Morana se <strong>ne može</strong> iskrcati iz jednog aviona i ukrcati u drugi u <strong>isto vrijeme</strong>, tj. između letova kojima Morana leti treba biti razmak od bar $1$ milisekunde između iskrcavanja i ukrcavanja.</p>

### 입력

<p>U prvom retku je prirodan broj $n$ ($1 ≤ n ≤ 10^5$), broj letova.</p>

<p>U i-tom od idućih $n$ redova nalaze se četiri broja: $s_i$, $m_i$, $d_i$, $c_i$, redom:</p>

<ul>
<li>$s_i$ ($1 ≤ s_i ≤ 2$) predstavlja smjer $i$-tog leta. Ako je $s_i = 1$, avion leti iz Zagreba prema Parizu, inače leti iz Pariza prema Zagrebu,</li>
<li>$m_i$ ($0 ≤ m_i ≤ 86\, 399\, 999$) predstavlja da avion polijeće u $m_i$-toj milisekundi dana,</li>
<li>$d_i$ ($1 ≤ d_i ≤ 86\, 399\, 999$) predstavlja trajanje leta u milisekundama,</li>
<li>$c_i$ ($1 ≤ c_i ≤ 10^7$) predstavlja cijenu leta.</li>
</ul>

<p>Svi letovi će biti takvi da polijeću i slijeću u tom danu.</p>

### 출력

<p>Ispišite koliko se najviše puta Morana može voziti avionom taj dan i koliko će ju to ukupno koštati.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera: Ako bi preračunali milisekunde u sate i minute, dobili bismo da će se Morana voziti avionom prema Parizu koji polijeće u 13:00 i traje $180$ min za cijenu $3$. Avion će sletiti u 16:00, pa će Morana otići na idući let u 17:30 prema Zagrebu koji traje $170$ min za cijenu $3$.</p>