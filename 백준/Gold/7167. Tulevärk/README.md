# [Gold V] Tulevärk - 7167

[문제 링크](https://www.acmicpc.net/problem/7167)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 구현, 시뮬레이션, 집합과 맵

### 문제 설명

<p>T&auml;nap&auml;eva ilutulestikuraketid koosnevad sageli mitmest astmest. Esimene aste lendab natuke ning plahvatab siis v&auml;iksemateks teise astme osadeks, mis v&otilde;ivad p&auml;rast natukest lendamist uuesti plahvatada.</p>

<p>Henrietta k&auml;is just ilutulestikku vaatamas ja joonistab n&uuml;&uuml;d ruudulisele paberile ilutulestiku pilti. Pildil lendab raketi esimene aste mingi arvu ruute otse &uuml;les ja jaguneb siis kaheks. Seej&auml;rel lendavad need kaks poolt esialgse suuna suhtes 45 kraadi all laiali, &uuml;ks vasakule, teine paremale. Raketi pooled lendavad veidi edasi ja v&otilde;ivad siis samamoodi lahku plahvatada.</p>

<p>Henrietta tahab enne pildi joonistamist teada, mitu ruutu tal tuleb kokku &auml;ra v&auml;rvida. Kui mingi ruut on juba v&auml;rvitud ja samale ruudule lendab m&otilde;ni teine raketi osa, pole seda vaja uuesti v&auml;rvida (allolevatel joonistel on raketi erinevad astmed n&auml;idatud eri v&auml;rvidega ainult jooniste &uuml;levaatlikkuse huvides).</p>

### 입력

<p>Tekstifaili esimesel real on raketi astmete arv $N$ ($1 \le N \le 30$) ja teisel real $N$ t&auml;isarvu $A_i$ ($1 \le A_i \le 5$), mis n&auml;itavad, kui kaugele iga aste lendab.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada v&auml;rvitavate ruutude koguarv.</p>