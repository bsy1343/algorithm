# [Platinum III] Drogi - 8429

[문제 링크](https://www.acmicpc.net/problem/8429)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬, 강한 연결 요소

### 문제 설명

<p>W Bajtocji jest&nbsp;<i>n</i>&nbsp;miast. Miasta są połączone jednokierunkowymi drogami. Każda droga łączy tylko dwa miasta i nie przechodzi przez żadne inne. Niestety, nie zawsze z każdego miasta da się dojechać do każdego innego. Kr&oacute;l Bajtazar postanowił rozwiązać ten problem. Kr&oacute;l ma świadomość, że budowanie nowych dr&oacute;g jest bardzo kosztowne, a budżet Bajtocji nie jest zbyt zasobny. Dlatego też poprosił Cię o pomoc. Trzeba obliczyć minimalną liczbę jednokierunkowych dr&oacute;g, kt&oacute;re trzeba zbudować, żeby z każdego miasta dało się dojechać do każdego innego miasta.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta opis istniejącej sieci dr&oacute;g,</li>
	<li>obliczy minimalną liczbę dr&oacute;g, kt&oacute;re trzeba dobudować tak, aby z każdego miasta w Bajtocji dało się dojechać do każdego innego,</li>
	<li>wypisze wynik.</li>
</ul>

### 입력

<p>Pierwszy wiersz zawiera dwie liczby całkowite&nbsp;<i>n</i>&nbsp;i&nbsp;<i>m</i>&nbsp;(2 &le;&nbsp;<i>n</i> &le;&nbsp;10&nbsp;000,&nbsp;0 &le;&nbsp;<i>m</i> &le;&nbsp;100&nbsp;000) oddzielone pojedynczym odstępem i oznaczające, odpowiednio, liczbę miast i liczbę dr&oacute;g w Bajtocji. Miasta są ponumerowane od 1 do&nbsp;<i>n</i>. W każdym z kolejnych&nbsp;<i>m</i>&nbsp;wierszy znajdują się dwie liczby całkowite oddzielone pojedynczym odstępem. W&nbsp;<i>i</i>&nbsp;+ 1-szym wierszu znajdują się liczby&nbsp;<i>a</i><sub>i</sub>&nbsp;i&nbsp;<i>b</i><sub>i</sub>&nbsp;(&nbsp;1 &le;&nbsp;<i>a</i><sub>i</sub>,&nbsp;<i>b</i><sub>i</sub> &le;&nbsp;<i>n</i>&nbsp;dla&nbsp;1 &le;&nbsp;<i>i</i> &le;&nbsp;<i>m</i>), reprezentują one jednokierunkową drogę prowadzącą z miasta&nbsp;<i>a</i><sub>i</sub>&nbsp;do&nbsp;<i>b</i><sub>i</sub>.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać dokładnie jedną nieujemną liczbę całkowitą -- minimalną liczbę dr&oacute;g, kt&oacute;re trzeba zbudować w Bajtocji tak, aby z każdego miasta dało się dojechać do każdego innego miasta.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b72520c9-6b11-465e-a819-023f590e406a/-/preview/" /></p>