# [Gold I] Цветные нули - 21755

[문제 링크](https://www.acmicpc.net/problem/21755)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 많은 조건 분기

### 문제 설명

<p>Толик только что узнал, что на свете существует двоичная система счисления. Обрадованный этим, он записал в столбик двоичные формы чисел 1, 2, ..., $n$. Получились числа 1, 10, 11, 100, 101, 110, 111, ...</p>

<p>После этого он стер все написанные единицы и стал изучать расположение нулей. Он выбрал число $k$ и в каждой строке, идя слева направо, выделил красным цветом каждый $k$-ый ноль, начиная с первого. Таким образом, оказались выделенными нули с номерами $1, k + 1, 2k + 1, \ldots$ Например если $k = 2$, $n = 56$ то получились бы такие строки:</p>

<table class="table table-bordered table-21755">
	<tbody>
		<tr>
			<td><span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
		</tr>
		<tr>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
		</tr>
		<tr>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
		</tr>
		<tr>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="one-21755">1</span></td>
		</tr>
		<tr>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755">0</span></td>
		</tr>
		<tr>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
		</tr>
		<tr>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span> <span class="zero-21755">0</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span> <span class="one-21755">1</span></td>
			<td><span class="one-21755">1</span> <span class="one-21755">1</span> <span class="one-21755">1</span> <span class="zero-21755-h">0</span> <span class="zero-21755">0</span> <span class="zero-21755-h">0</span></td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">(красные нули выделены жирным шрифтом и подчеркнуты)</p>

<p>Теперь Толику интересно, сколько же ноликов он выделил. Помогите ему их посчитать.</p>

### 입력

<p>Во входном файле содержатся числа $n$ и $k$ ($1 \le n &lt; 2^{31}$, $1 \le k \le 30$).</p>

### 출력

<p>Выходной файл должен содержать одно число --- количество красных нулей.</p>