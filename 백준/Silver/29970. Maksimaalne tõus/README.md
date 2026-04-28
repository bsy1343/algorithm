# [Silver V] Maksimaalne tõus - 29970

[문제 링크](https://www.acmicpc.net/problem/29970)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 40, 맞힌 사람: 32, 정답 비율: 72.727%

### 분류

구현

### 문제 설명

<p>Nii suusa- kui jooksu- kui rattamaratonide &uuml;ks t&auml;htsamaid iseloomustajaid on raja k&otilde;rgusprofiil ja eriti selle maksimaalne t&otilde;us.</p>

<p>Raja k&otilde;rgusprofiil annab $N$ rajapunkti k&otilde;rgused $H_1$, $H_2$, $\dots$, $H_N$. T&otilde;usuks nimetatakse sellist j&auml;rjestikuste punktide jada, kus iga j&auml;rgmine punkt on eelmisest rangelt k&otilde;rgemal. T&otilde;usu k&otilde;rguseks nimetatakse selle alguse ja l&otilde;pu k&otilde;rguste vahet.</p>

<p>Kirjutada programm, mis leiab antud rajaprofiilis maksimaalse t&otilde;usu k&otilde;rguse.</p>

### 입력

<p>Tekstifaili esimesel real on rajaprofiili punktide arv $N$ ($1 \le N \le 50\,000$) ja j&auml;rgmisel $N$ real punktide t&auml;isarvulised k&otilde;rgused $H_i$ ($0 \le H_i \le 1\,000\,000$) j&auml;rjestatuna stardist fini&scaron;i suunas.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada &uuml;ks t&auml;isarv: maksimaalne t&otilde;usu k&otilde;rgus sisendis antud rajaprofiilis, see t&auml;hendab maksimaalne k&otilde;rguste vahe $H_i - H_j$, kus $j \le i$ ja $H_j &lt; H_{j+1} &lt; \dots &lt; H_{i-1} &lt; H_i$. Kui rajal pole &uuml;htki t&otilde;usu (haha :), siis v&auml;ljastada vastusena 0.</p>