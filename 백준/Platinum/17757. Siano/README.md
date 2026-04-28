# [Platinum I] Siano - 17757

[문제 링크](https://www.acmicpc.net/problem/17757)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 10, 맞힌 사람: 9, 정답 비율: 37.500%

### 분류

이분 탐색, 자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 스택

### 문제 설명

<p>Rolnik Bajtazar zakupił pole o powierzchni n ar&oacute;w, na kt&oacute;rym zamierza posiać trawę. Skoszona i wysuszona trawa posłuży za paszę dla zwierząt hodowanych w gospodarstwie Bajtazara.</p>

<p>Na polu zostanie posiana mieszanka n gatunk&oacute;w traw &ndash; każdy z gatunk&oacute;w zajmie w sumie 1 ar gruntu. O i-tym gatunku wiadomo, że przez jeden dzień źdźbło trawy tego gatunku rośnie o ai centymetr&oacute;w, niezależnie od warunk&oacute;w pogodowych i żyzności gleby. Wiadomo także, że ze skoszenia jednego centymetra trawy na obszarze jednego ara uzyskuje się dokładnie 1 kilogram siana.</p>

<p>Bajtazar dysponuje kosiarką, kt&oacute;rą można tak ustawić, aby przycięła trawę do dowolnej wysokości b &ndash; przy takim ustawieniu każde źdźbło trawy wyższe niż b centymetr&oacute;w zostanie przycięte do wysokości dokładnie b centymetr&oacute;w.</p>

<p>Bajtockie prawo wymaga, aby po każdym skoszeniu trawy udokumentować, ile siana uzyskano ze skoszonej trawy. Bajtazar stanął przed wyborem: musi albo kupić wagę, albo napisać program, kt&oacute;ry na podstawie dat koszeń i ustawień kosiarki, oszacuje wagę siana uzyskanego po każdym skoszeniu. Druga z tych opcji wydała mu się wygodniejsza i tańsza.</p>

<p>Przyjmujemy, że trawa zostanie posiana w dniu 0 o p&oacute;łnocy i zawsze będzie koszona o p&oacute;łnocy. Zakładamy także, że czas potrzebny do skoszenia pola do dowolnej wysokości b jest zaniedbywalnie mały.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n i m (1 &le; n, m &le; 500 000), oznaczające odpowiednio powierzchnię pola Bajtazara w arach (i jednocześnie liczbę zasianych gatunk&oacute;w traw) oraz liczbę skoszeń trawy. W drugim wierszu znajduje się ciąg n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup>) oznaczających szybkości wzrostu kolejnych gatunk&oacute;w trawy.</p>

<p>W kolejnych m wierszach znajdują się opisy koszeń wykonanych przez Bajtazara: i-te koszenie jest opisane przez znajdujące się w i-tym z tych wierszy dwie liczby całkowite d<sub>i</sub> i b<sub>i</sub> (1 &le; d<sub>i</sub> &le; 10<sup>12</sup>, 0 &le; b<sub>i</sub> &le; 10<sup>12</sup>) oznaczające, że w dniu di Bajtazar przyciął trawę do długości bi centymetr&oacute;w. Możesz założyć, że opisy koszeń są podane w kolejności chronologicznej, tzn. d<sub>1</sub> &lt; d<sub>2</sub> &lt; . . . &lt; d<sub>m</sub>.</p>

<p>Ponadto możesz założyć, że Bajtazar nigdy nie dopuści do sytuacji, w kt&oacute;rej trawa w pewnym miejscu pola będzie miała wysokość przekraczającą 10<sup>12</sup> centymetr&oacute;w.</p>

### 출력

<p>Na wyjście należy wypisać dokładnie m wierszy. W i-tym z tych wierszy powinna znaleźć się sumaryczna waga siana (w kilogramach) uzyskanego po i-tym skoszeniu trawy.</p>

### 힌트

<p>Wysokości źdźbeł trawy gatunk&oacute;w 1, 2, 3, 4 przed i po kolejnych skoszeniach trawy pokazuje poniższa tabelka.</p>

<table class="table table-bordered" style="width: 50%;">
	<thead>
		<tr>
			<th style="text-align: center;">Dzień</th>
			<th style="text-align: center;">Przed skoszeniem</th>
			<th style="text-align: center;">Po skoszeniu</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1, 2, 4, 3</td>
			<td style="text-align: center;">1, 1, 1, 1</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">2, 3, 5, 4</td>
			<td style="text-align: center;">2, 2, 2, 2</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">3, 4, 6, 5</td>
			<td style="text-align: center;">0, 0, 0, 0</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">1, 2, 4, 3</td>
			<td style="text-align: center;">1, 2, 4, 3</td>
		</tr>
	</tbody>
</table>