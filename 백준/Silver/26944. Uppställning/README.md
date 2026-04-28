# [Silver II] Uppställning - 26944

[문제 링크](https://www.acmicpc.net/problem/26944)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 20, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>En grupp med n barn, l&aring;t oss kalla dem A, B, C och s&aring; vidare, beslutar sig f&ouml;r att testa din tankef&ouml;rm&aring;ga. Utan att du ser dem st&auml;ller de upp sig p&aring; en rad. Sen r&auml;knar vart och en av dem hur m&aring;nga av de barn som st&aring;r till v&auml;nster som &auml;r l&auml;ngre &auml;n hen sj&auml;lv, och sedan likadant med dem som st&aring;r till h&ouml;ger. Var och en skriver ner dessa antal p&aring; en lapp som de ger till dig efter att ha fr&aring;ng&aring;tt uppst&auml;llningen. Deras enkla uppmaning till dig &auml;r att tala om i vilken ordning de stod.</p>

<p>Ett exempel med fem barn visas i figuren. A har ett l&auml;ngre barn (D) till v&auml;nster om sig och tv&aring; (C och E) till h&ouml;ger. B har tre l&auml;ngre barn till v&auml;nster om sig och ett till h&ouml;ger. C har ett l&auml;ngre barn till v&auml;nster om sig men inget till h&ouml;ger och s&aring; vidare. Informationen p&aring; lapparna kan sammanfattas s&aring; h&auml;r:</p>

<table class="table table-bordered table-center-20">
	<tbody>
		<tr>
			<th>Barn</th>
			<th>V&auml;nster</th>
			<th>H&ouml;ger</th>
		</tr>
		<tr>
			<td>A</td>
			<td>1</td>
			<td>2</td>
		</tr>
		<tr>
			<td>B</td>
			<td>3</td>
			<td>1</td>
		</tr>
		<tr>
			<td>C</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>D</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<td>E</td>
			<td>2</td>
			<td>0</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1f9dda4e-60b2-4c40-a5cf-4ac20dc1b3e3/-/preview/" style="width: 144px; height: 117px;" /></p>

<p>Tyv&auml;rr klarade du inte n&ouml;ten utan m&aring;ste i hemlighet smyga iv&auml;g och skriva ett datorprogram som l&ouml;ser uppgiften. F&ouml;r att underl&auml;tta f&ouml;r dig sj&auml;lv n&auml;sta g&aring;ng barnen ans&auml;tter dig s&aring; vill du kunna variera b&aring;de antalet barn (mellan 3 och 8, inklusive) och informationen p&aring; lapparna. Du kan f&ouml;ruts&auml;tta att alla barn &auml;r olika l&aring;nga och att de inte har gjort n&aring;got misstag n&auml;r de skrev lapparna. Intressant nog finns det aldrig mer &auml;n en l&ouml;sning.</p>

### 입력

<p>F&ouml;rsta raden i indata best&aring;r av ett heltal $n$ ($3 \le n \le 8$), antal barn. D&auml;refter f&ouml;ljer $n$ rader med tv&aring; heltal vardera: antal barn till v&auml;nster som &auml;r l&auml;ngre &auml;n barnet sj&auml;lvt, och antalet till h&ouml;ger.</p>

### 출력

<p>Skriv ut en rad med $n$ tecken som beskriver barnens uppst&auml;llning, som en omkastning av bokst&auml;verna <code>A</code>, <code>B</code>, <code>C</code>, etc.</p>