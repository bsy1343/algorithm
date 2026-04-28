# [Gold III] Zmiennoliterowe słowo II - 26760

[문제 링크](https://www.acmicpc.net/problem/26760)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

수학, 다이나믹 프로그래밍, 브루트포스 알고리즘, 조합론

### 문제 설명

<p>Słowo nazywamy zmiennoliterowym jeśli każde jego dwie sąsiednie litery są r&oacute;żne. Na przykład słowa <code>mama</code>, <code>ojojoj</code> oraz <code>olimpiada</code> są zmiennoliterowe, zaś <code>anna</code> oraz <code>zorro</code> nie są.</p>

<p>Bajtazar, jak każdy normalny chłopiec w jego wieku, ma swoje ulubione słowo. Niestety, słowo to niekoniecznie jest zmiennoliterowe. Chciałby zakryć wszystkie jego litery poza dokładnie trzema, w taki spos&oacute;b, żeby pozostałe trzy litery czytane od lewej do prawej tworzyły słowo zmiennoliterowe. Bajtazar obawia się, że będzie miał problem żeby się zdecydować, kt&oacute;re litery zakryć. Wie, że trzeba działać na spokojnie, postanowił więc policzyć najpierw dwie wartości:</p>

<ul>
	<li>na ile sposob&oacute;w może wybrać pozycje liter, kt&oacute;re pozostawi (i będą one tworzyły trzyliterowe zmiennoliterowe słowo)?</li>
	<li>ile r&oacute;żnych trzyliterowych zmiennoliterowych sł&oacute;w może otrzymać?</li>
</ul>

<p>Na przykład w słowie <code>aabbcc</code> możliwe jest uzyskanie tylko jednego słowa zmiennoliterowego (<code>abc</code>), jednak wyboru pozycji można dokonać aż na osiem sposob&oacute;w.</p>

<p>Czy pomożesz mu to obliczyć?</p>

<p>Uwaga: Zwr&oacute;ć uwagę na sekcję Ocenianie, gdzie znajdują się warunki częściowej oceny w przypadku, jeśli potrafisz pom&oacute;c Bajtazarowi tylko z wyznaczeniem jednej spośr&oacute;d powyższych wartości.</p>

<p>Napisz program, kt&oacute;ry wczyta słowo Bajtazara, wyznaczy wartości o kt&oacute;re pyta Bajtazar i wypisze je na standardowe wyjście.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się ulubione słowo Bajtazara &ndash; niepusty ciąg małych liter alfabetu angielskiego o długości nie przekraczającej 100 000 znak&oacute;w.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinny się znaleźć dwie liczby całkowite oddzielone pojedyncznym odstępem: liczba sposob&oacute;w wyboru trzech niezakrytych liter w ulubionym słowie, aby tworzyły słowo zmiennoliterowe oraz liczba r&oacute;żnych trzyliterowych sł&oacute;w zmiennoliterowych, kt&oacute;re Bajtazar może uzyskać zakrywając litery swojego ulubionego słowa.</p>