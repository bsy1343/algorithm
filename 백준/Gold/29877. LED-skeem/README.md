# [Gold III] LED-skeem - 29877

[문제 링크](https://www.acmicpc.net/problem/29877)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 15, 맞힌 사람: 6, 정답 비율: 25.000%

### 분류

너비 우선 탐색, 방향 비순환 그래프, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Valgusdiood (ingl <em>light-emitting diode</em>, LED) on elektroonikakomponent, mille kaht kontakti nimetatakse anoodiks ja katoodiks (alloleval joonisel vasakul vastavalt A ja K). Kui valgusdioodi anoodile rakendada k&otilde;rgem pinge kui katoodile (joonisel (a)), s&uuml;ttib diood p&otilde;lema. Kui katoodil on k&otilde;rgem pinge kui anoodil (joonisel (b)), siis diood ei s&uuml;tti, aga ei l&auml;he ka rikki. Samuti ei s&uuml;tti diood siis, kui selle anoodile ja katoodile rakendada v&otilde;rdsed pinged (joonisel (c) ja (d)).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/29877.%E2%80%85LED-skeem/7382a728.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/29877.%E2%80%85LED-skeem/7382a728.png" data-original-src="https://upload.acmicpc.net/a8c603a3-fb9d-4b99-abb3-1419a070ea16/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 344px; height: 126px;" /></p>

<p>Jukul on hulk valgusdioode ja kontroller nende juhtimiseks. Kontrolleril on $N$ v&auml;ljundit, mis on nummerdatud $1 \ldots N$. Kontrolleri igale v&auml;ljundile saab programmiga rakendada kas k&otilde;rgema v&otilde;i madalama pinge (joonistel vastavalt 1 ja 0) ja niimoodi juhtida kontrolleri k&uuml;lge &uuml;hendatud valgusdioodide s&uuml;ttimist.</p>

<p>Juku tahab oma kontrolleri k&uuml;lge &uuml;hendada palju dioode nii, et iga dioodi oleks v&otilde;imalik teistest eraldi sisse l&uuml;litada (s.t tekitada olukord, kus p&otilde;leb ainult see diood). N&auml;iteks alloleval joonisel vasakul kujutatud skeemis on v&otilde;imalik kumbagi dioodi eraldi sisse l&uuml;litada, aga paremal kujutatud skeemis s&uuml;ttivad m&otilde;lemad dioodid alati korraga.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/29877.%E2%80%85LED-skeem/2e9fece1.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/29877.%E2%80%85LED-skeem/2e9fece1.png" data-original-src="https://upload.acmicpc.net/33d48edf-8289-4efa-815e-f8434c135491/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 516px; height: 88px;" /></p>

<p>Kirjutada programm, mis saab Juku koostatud skeemi kirjelduse ja leiab, milliseid dioode on v&otilde;imalik selle skeemiga teistest eraldi sisse l&uuml;litada.</p>

### 입력

<p>Sisendi esimesel real on kontrolleri v&auml;ljundite arv $N$ ($2 \le N \le 250$) ja dioodide arv $M$ ($1 \le M \le 25\,000$). J&auml;rgmisel $M$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu $A_i$ ja $B_i$ ($1 \le A_i, B_i \le N$, $A_i \ne B_i$), mis n&auml;itavad, et $i$. dioodi anood on &uuml;hendatud kontrolleri v&auml;ljundisse $A_i$ ja katood v&auml;ljundisse $B_i$.</p>

### 출력

<p>V&auml;ljastada &uuml;ks rida iga dioodi kohta. Kui kontrolleri v&auml;ljundid on v&otilde;imalik pingestada nii, et p&otilde;lema s&uuml;ttib ainult $i$. diood, v&auml;ljasta $i$. reale &#39;<code>JAH</code>&#39;, vastasel juhul aga &#39;<code>EI</code>&#39;.</p>