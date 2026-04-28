# [Silver I] Zbrodnia na Piccadilly Circus - 8442

[문제 링크](https://www.acmicpc.net/problem/8442)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 107, 정답: 19, 맞힌 사람: 11, 정답 비율: 17.188%

### 분류

구현

### 문제 설명

<p>Sherlock Holmes prowadzi śledztwo w sprawie zbrodni na Piccadilly Circus. Holmes zastanawia się, jaka była maksymalna, a jaka minimalna liczba os&oacute;b przebywających r&oacute;wnocześnie na miejscu zbrodni w czasie, gdy mogła zostać ona popełniona. Scotland Yard przeprowadził szczeg&oacute;łowe śledztwo, przesłuchał wszystkie osoby, kt&oacute;re były widziane na miejscu zbrodni i ustalił, o kt&oacute;rej godzinie pojawiły sie one na miejscu zbrodni, a o kt&oacute;rej je opuściły. Doktor Watson zaofiarował się pom&oacute;c przetworzyć dane zgromadzone przez Scotland Yard i wyznaczyć liczby, kt&oacute;re interesują Sherlocka Holmesa, ma jednak z tym problemy. Pom&oacute;ż mu!</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia przedział czasowy, w kt&oacute;rym została popełniona zbrodnia oraz dane zgromadzone przez Scotland Yard,</li>
	<li>wyznaczy minimalną (może to być zero, chociaż dziwne, żeby w czasie zbrodni nikt nie przebywał w miejscu, w kt&oacute;rym się dokonała, ale właśnie takimi sprawami zajmują się Holmes i Watson) i maksymalną liczbę os&oacute;b, kt&oacute;re r&oacute;wnocześnie przebywały na miejscu zbrodni w przedziale czasu, gdy mogła ona zostać popełniona,</li>
	<li>wypisze wyniki na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite <em>p</em>&nbsp;i <em>k</em>, 0 &le; <em>p</em> &le; <em>k</em> &le; 1000000000. Są to, odpowiednio, najwcześniejsza i najp&oacute;źniejsza chwila, kiedy mogła zostać popełniona zbrodnia. Drugi wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>, 3 &le; <em>n</em> &le; 5000. Jest to liczba os&oacute;b przesłuchanych przez Scotland Yard. W każdym z kolejnych <em>n</em>&nbsp;wierszy są zapisane po dwie liczby całkowite - w wierszu <em>i</em> + 2&nbsp;zapisane są liczby <em>a<sub>i</sub></em>&nbsp;i&nbsp;<em>b<sub>i</sub></em>&nbsp;oddzielone pojedynczym odstępem, 0 &le; <em>a<sub>i</sub></em> &le; <em>b<sub>i</sub></em> &le; 1000000000. Są to, odpowiednio, chwila pojawienia się <em>i</em>-tej osoby na miejscu zbrodni i jej odejścia. Oznacza to, iż&nbsp;<em>i</em>-ta osoba przebywała na miejscu zbrodni przez cały czas od chwili <em>a<sub>i</sub></em>&nbsp;do chwili&nbsp;<em>b<sub>i</sub></em>&nbsp;(włącznie).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście, w pierwszym wierszu i jedynym wierszu, dwie liczby całkowite oddzielone pojedynczym odstępem: minimalną i maksymalną liczbę os&oacute;b, kt&oacute;re były r&oacute;wnocześnie na miejscu zbrodni, w czasie od chwili <em>p</em>&nbsp;do chwili <em>k</em>&nbsp;(włącznie).</p>