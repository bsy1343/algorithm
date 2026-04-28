# [Gold III] Bakterid - 7128

[문제 링크](https://www.acmicpc.net/problem/7128)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 12, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Juku unustas &otilde;htul hambaid pesta ning tema suus hakkasid paljunema bakterid. Iga bakter on kas noor v&otilde;i t&auml;iskavanu. Iga sekundi jooksul s&uuml;nnitab iga t&auml;iskasvanu &uuml;he uue noore bakteri, kes saab j&auml;rgmise sekundi jooksul ise t&auml;iskasvanuks. &Uuml;kski bakter kunagi ei sure.</p>

<p>Leida, kui palju baktereid (noori ja t&auml;iskasvanuid kokku) on Juku suus $T$ sekundi p&auml;rast, kui alguses on seal $N$ noort ning $V$ t&auml;iskasvanut. Tegeliku arvu asemel v&auml;ljastada j&auml;&auml;k, mis tekib selle jagamisel antud arvuga $K$.</p>

### 입력

<p>Tekstifaili ainsal real on neli t&uuml;hikutega eraldatud t&auml;isarvu: $N$, $V$, $T$ ja $K$ ($0 \le N \le 10^9$, $0 \le V \le 10^9$, $0 \le T \le 10^{18}$, $0 &lt; K \le 10^9$).</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada v&auml;&auml;rtus $(X \bmod K)$, kus $X$ on bakterite koguarv Juku suus $T$ sekundi p&auml;rast ning &quot;$\bmod$&quot; t&auml;histab jagamisel tekkiva j&auml;&auml;gi leidmist.</p>