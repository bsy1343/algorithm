# [Gold III] Треугольник Паскаля - 21753

[문제 링크](https://www.acmicpc.net/problem/21753)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 41, 맞힌 사람: 26, 정답 비율: 72.222%

### 분류

수학, 조합론

### 문제 설명

<p>Треугольник Паскаля --- это бесконечный треугольник из чисел, который имеет следующий вид:</p>

<table class="table table-bordered table-21753">
	<tbody>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>2</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>3</td>
			<td>&nbsp;</td>
			<td>3</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>4</td>
			<td>&nbsp;</td>
			<td>6</td>
			<td>&nbsp;</td>
			<td>4</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>5</td>
			<td>&nbsp;</td>
			<td>10</td>
			<td>&nbsp;</td>
			<td>10</td>
			<td>&nbsp;</td>
			<td>5</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>6</td>
			<td>&nbsp;</td>
			<td>15</td>
			<td>&nbsp;</td>
			<td>20</td>
			<td>&nbsp;</td>
			<td>15</td>
			<td>&nbsp;</td>
			<td>6</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
			<td>7</td>
			<td>&nbsp;</td>
			<td>21</td>
			<td>&nbsp;</td>
			<td>35</td>
			<td>&nbsp;</td>
			<td>35</td>
			<td>&nbsp;</td>
			<td>21</td>
			<td>&nbsp;</td>
			<td>7</td>
			<td>&nbsp;</td>
			<td>1</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
			<td>&nbsp;</td>
			<td>...</td>
		</tr>
	</tbody>
</table>

<p>Строки треугольника Паскаля нумеруются с нуля, числа в каждой строке также нумеруются с нуля. Нулевая строка содержит единственное число --- единицу, а каждая следующая содержит на одно число больше, чем предыдущая. Нулевое и последнее число в каждой строке равны единице, а каждое из остальных равно сумме двух чисел предыдущей строки, расположенных над ним.</p>

<p>Таким образом, $i$-ая строка содержит $i + 1$ число. &nbsp;Если обозначить $j$-ый элемент $i$-ой строки как $a_{i,j}$, то выполняется равенство $a_{i,j} = a_{i - 1,j - 1} + a_{i-1,j}$. Заметим, что это равенство выполняется и для крайних элементов, если положить отсутствующие элементы предыдущей строки (элементы с номерами $-1$ и $i$) равными нулю.</p>

<p>Коля хочет узнать, сколько нечетных чисел в $n$-ой строке треугольника Паскаля. Он начал рисовать треугольник, но очень скоро тот перестал помещаться на листочек. Тогда Коля решил сделать это с помощью компьютера. Помогите ему.</p>

### 입력

<p>Во входном файле содержится число $n$ ($0 \le n \le 2 \cdot 10^9$).</p>

### 출력

<p>Выходной файл должен содержать одно число --- количество нечетных чисел в $n$-ой строке треугольника Паскаля.</p>