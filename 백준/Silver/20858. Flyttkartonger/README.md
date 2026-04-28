# [Silver I] Flyttkartonger - 20858

[문제 링크](https://www.acmicpc.net/problem/20858)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

수학, 그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Du har just hj&auml;lpt en kompis att flytta, men tyv&auml;rr har du fastnat i fel &auml;nde av en smal korridor full med flyttkartonger. Korridoren best&aring;r av $N$ staplar av flyttkartonger, d&auml;r stapel nummer $i$ inneh&aring;ller $a_i$ kartonger. Alla kartonger &auml;r lika stora.</p>

<p>Det enda s&auml;ttet att ta sig ut &auml;r att g&aring; ovanp&aring; staplarna fr&aring;n stapel $1$ till stapel $N$. Om man befinner sig p&aring; en stapel kan man g&aring; till en n&auml;rliggande stapel, men bara om den inte &auml;r h&ouml;gre &auml;n den man st&aring;r p&aring;. Om stapeln man st&aring;r &auml;r minst tv&aring; kartonger h&ouml;gre &auml;n en n&auml;rliggande stapel kan man dessutom knuffa ner den &ouml;versta kartongen fr&aring;n stapeln man st&aring;r p&aring; till den n&auml;rliggande stapeln. Detta kan upprepas hur m&aring;nga g&aring;nger som helst.&nbsp;</p>

<p>Du befinner dig just nu p&aring; stapel $1$. Tyv&auml;rr kanske det &auml;r om&ouml;jligt f&ouml;r dig att komma till stapel $N$. Men som tur &auml;r f&aring;r du l&auml;gga till valfritt antal <em>extra</em>&nbsp;kartonger till stapel $1$ innan du b&ouml;rjar g&aring;. Skriv ett program som ber&auml;knar hur m&aring;nga extra kartonger du beh&ouml;ver l&auml;gga till f&ouml;r att kunna ta dig till stapel $N$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20858.%E2%80%85Flyttkartonger/0dce3b5f.png" data-original-src="https://upload.acmicpc.net/e11b31c0-70a3-4b51-830b-f5168789dfd9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 270px; height: 127px;" /></p>

<p style="text-align: center;">Bilden visar exempel 1. De m&ouml;rkgr&aring; kartongerna &auml;r extrakartonger. Strategin &auml;r allts&aring; att knuffa ner den &ouml;versta extrakartongen till stapel 2. D&auml;refter kan man g&aring; raka v&auml;gen till stapel 4. Det hade inte hade fungerat med f&auml;rre &auml;n 3 extrakartonger.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $N$, antalet staplar. P&aring; andra raden st&aring;r $N$ heltal $a_i$, antalet kartonger i varje stapel.&nbsp;</p>

### 출력

<p>Programmet ska skriva ut ett heltal: det minsta antalet extra flyttkartonger som beh&ouml;ver l&auml;ggas till.</p>

### 제한

<ul>
	<li>$3\le N\le 20$</li>
	<li>$1 \le a_i \le 3000$</li>
</ul>