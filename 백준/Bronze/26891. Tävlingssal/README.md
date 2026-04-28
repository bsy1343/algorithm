# [Bronze I] Tävlingssal - 26891

[문제 링크](https://www.acmicpc.net/problem/26891)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 52, 맞힌 사람: 49, 정답 비율: 72.059%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>N&auml;r man anordnar en t&auml;vling f&ouml;r PO (Pragmatiska Ortogonalitetsf&ouml;reningen) &auml;r det viktigt att se till att deltagarna sitter strukturerat och samtidigt inte sitter f&ouml;r n&auml;ra varandra. P&aring; s&aring; s&auml;tt undviker man att deltagarna blir st&ouml;rda av andra samtidigt som man motverkar fusk. Arrang&ouml;rerna har kommit fram till att deltagarna ska sitta i ett m&ouml;nster som ser ut som ett regelbundet rutn&auml;t med avst&aring;ndet minst $1$ till n&auml;rmaste granne (se bild nedan). Avst&aring;ndet fr&aring;n en deltagare ut till v&auml;ggen ska ocks&aring; vara minst $1$. T&auml;vlingssalen ska dessutom vara en rektangel vars sidor &auml;r parallella med rutn&auml;tet.</p>

<p>Givet antalet deltagare $N$, best&auml;m minsta m&ouml;jliga arean f&ouml;r t&auml;vlingssalen, givet att man placerar deltagarna optimalt.</p>

### 입력

<p>Ett heltal $N$ p&aring; en enda rad - antalet deltagare.</p>

### 출력

<p>Skriv ut ett heltal p&aring; en enda rad - den minsta m&ouml;jliga arean f&ouml;r t&auml;vlingssalen.</p>

### 제한

<ul>
	<li>$ 1 \le N \le 10^9 $</li>
</ul>

### 힌트

<p>Se Figure 1 f&ouml;r en f&ouml;rklaring av indataexemplet. De svarta pilarna illustrerar det n&ouml;dv&auml;ndiga avst&aring;ndet $1$ mellan deltagarna och v&auml;ggarna.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/26891.%E2%80%85T%C3%A4vlingssal/1f634995.png" data-original-src="https://upload.acmicpc.net/15e81f6b-ea8a-43f2-8c6e-40fa225a23bd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 101px;" /></p>

<p style="text-align: center;">En illustration av en optimal l&ouml;sning f&ouml;r Sample Input 1.</p>