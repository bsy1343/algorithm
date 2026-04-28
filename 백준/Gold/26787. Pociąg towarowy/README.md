# [Gold IV] Pociąg towarowy - 26787

[문제 링크](https://www.acmicpc.net/problem/26787)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 10, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 정렬, 스위핑

### 문제 설명

<p>Bajtek i Bitek uwielbiają obserwować pociągi przejeżdżające niedaleko ich domu. Największą miłością pałają do tych towarowych, bo są zwykle bardzo długie i mają r&oacute;żnorodne wagony. Chłopcy postanowili dokumentować to, z jakich rodzaj&oacute;w wagon&oacute;w składają się pociągi. Dla uproszczenia, potencjalne rodzaje wagon&oacute;w będziemy numerować od 1 do k. Wagony o tym samym rodzaju są dla chłopc&oacute;w nierozr&oacute;żnialne.</p>

<p>Gdy pociąg przejeżdża, obaj chłopcy w swoich zeszytach notują rodzaje kolejnych wagon&oacute;w. Bajtek jest starszy i potrafi już bezbłędnie zanotować rodzaje wszystkich wagon&oacute;w. Bitek jest młodszy i nie ma jeszcze takiej wprawy w pisaniu. Zdarza się, że zanim zdąży zanotować rodzaj wagonu, przez przejazd przejadą już kolejne wagony, kt&oacute;rych Bitek nie zauważy. Zatem na liście Bitka niekt&oacute;re z wagon&oacute;w mogą zostać pominięte.</p>

<p>Chłopcy analizują teraz swoje zapisy i zastanawiają się, kt&oacute;re z wagon&oacute;w pociągu Bitek m&oacute;gł zanotować, a kt&oacute;re na pewno zostały przez niego przeoczone.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera trzy liczby całkowite n, m oraz k (1 &le; n, m, k &le; 300 000), oznaczające kolejno długość listy Bajtka (r&oacute;wną liczbie wagon&oacute;w w pociągu), długość listy Bitka oraz liczbę r&oacute;żnych rodzaj&oacute;w wagon&oacute;w.</p>

<p>W drugim wierszu znajduje się ciąg długości n złożony z liczb całkowitych z przedziału [1, k], oznaczających kolejne rodzaje wagon&oacute;w na liście Bajtka. W trzecim wierszu znajduje się ciąg długości m w takim samym formacie &ndash; lista Bitka.</p>

<p>Możesz założyć, że Bitek być może pominął niekt&oacute;re wagony z listy Bajtka, ale nie dopisał nic &bdquo;dodatkowo&rdquo;. Innymi słowy, dane wejściowe dobrane są tak, że da się zmazać pewną liczbę wagon&oacute;w (być może zero) z listy Bajtka i uzyskać listę Bitka.</p>

### 출력

<p>Na wyjście należy wypisać n liczb całkowitych pooddzielanych pojedynczymi odstępami: i-ta z tych liczb ma być r&oacute;wna <code>1</code>, jeśli i-ty wagon m&oacute;gł zostać zanotowany przez Bitka, lub <code>0</code> jeśli na pewno nie m&oacute;gł być zanotowany.</p>

### 힌트

<p>Wyjaśnienie przykładu: Bitek m&oacute;gł zanotować wagony o numerach:</p>

<ul>
	<li>1, 2, 4 i 5,</li>
	<li>1, 2, 4 i 9,</li>
	<li>1, 2, 7 i 9,</li>
	<li>1, 6, 7 i 9,</li>
	<li>albo 4, 6, 7 i 9.</li>
</ul>