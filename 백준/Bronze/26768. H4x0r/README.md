# [Bronze IV] H4x0r - 26768

[문제 링크](https://www.acmicpc.net/problem/26768)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1582, 정답: 1158, 맞힌 사람: 1024, 정답 비율: 72.986%

### 분류

구현, 문자열

### 문제 설명

<p>Od dawna wiadomo, że hakerzy posługują się własnym językiem, r&oacute;żnymi skr&oacute;tami i innymi formami zaciemniania, żeby zacierać ścieżki po sobie. O najlepszych z nich zwykle mawia się &bdquo;h4x0rzy&rdquo;.</p>

<p>Niekt&oacute;rzy hakerzy czasami zamieniają niekt&oacute;re litery na cyfry, żeby ich tekst wyglądał bardziej profesjonalnie. Każde wystąpienie jednej z poniższych liter w tabeli zamieniane jest na odpowiadającą jej cyfrę. Pozostałe znaki pozostają niezmienione.</p>

<table class="table table-bordered table-center-10">
	<tbody>
		<tr>
			<th>Litera</th>
			<th>Cyfra</th>
		</tr>
		<tr>
			<td>a</td>
			<td>4</td>
		</tr>
		<tr>
			<td>e</td>
			<td>3</td>
		</tr>
		<tr>
			<td>i</td>
			<td>1</td>
		</tr>
		<tr>
			<td>o</td>
			<td>0</td>
		</tr>
		<tr>
			<td>s</td>
			<td>5</td>
		</tr>
	</tbody>
</table>

<p>Napisz program, kt&oacute;ry wczyta napis, przekształci go do hakerskiego slangu zgodnie z powyższą tabelą i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się niepusty ciąg małych liter alfabetu angielskiego &ndash; napis, kt&oacute;ry należy przekształcić do hakerskiego slangu. Długość napisu nie przekracza 1 000 000 znak&oacute;w.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinien się znaleźć napis z wejścia przedstawiony jako hakerski slang.</p>