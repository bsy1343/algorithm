# [Gold III] Strajk - 8645

[문제 링크](https://www.acmicpc.net/problem/8645)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

구현, 그래프 이론, 그리디 알고리즘, 시뮬레이션, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Bajtocja szczyci się posiadaniem największej na świecie kopalni węgla brunatnego. Codziennie węgiel z kopalni jest transportowany siecią kolejową do wszystkich bajtockich miast, aby mieszkańcy mieli czym palić w piecach.</p>

<p>Transport odbywa się w ten spos&oacute;b, że najpierw pewna liczba pociąg&oacute;w wyrusza z miasta, w kt&oacute;rym znajduje się kopalnia, do kilku innych miast, następnie z tamtych miast odjeżdżają kolejne pociągi do jeszcze innych miast i tak dalej. Dla każdego miasta Bajtocji istnieje co najmniej jeden ciąg pociąg&oacute;w <em>p</em><sub>1</sub>, <em>p</em><sub>2</sub>, ..., <em>p<sub>k</sub></em>, taki że węgiel z kopalni jest ładowany do pociągu <em>p</em><sub>1</sub>, następnie kolejno dla <em>i</em> = 1, ..., <em>k</em> - 1&nbsp;węgiel jest przeładowywany z pociągu <em>p<sub>i</sub></em>&nbsp;do pociągu <em>p</em><sub><em>i</em>+1</sub>, aż w końcu pociągiem <em>p<sub>k</sub></em>&nbsp;dociera do tego miasta. Do każdego miasta (opr&oacute;cz miasta z kopalnią) może przyjeżdżać kilka pociąg&oacute;w, jednak nie występują pętle - jeżeli w danym mieście wsiądziemy do pociągu, to na pewno drogą kolejową już do niego nie wr&oacute;cimy.</p>

<p>Pociągi są skomunikowane - czasy odjazdu są tak dobrane, że pociągi wyruszają z danego miasta dopiero po tym, jak już przyjadą do niego wszystkie zaplanowane pociągi z węglem z kopalni. Jeżeli pociąg będzie się op&oacute;źniał, to może to także spowodować op&oacute;źnienia innych pociąg&oacute;w. Kolejarze planują strajk: mogą zatrzymać dokładnie jeden pociąg na <em>k</em>&nbsp;minut. Zamierzają tak wybrać pociąg, aby sumaryczne op&oacute;źnienie wszystkich pociąg&oacute;w było maksymalne.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite <em>n</em>&nbsp;oraz <em>m</em>&nbsp;(2 &le; <em>n</em> &le; 400, 1 &le; <em>m</em> &le; 80 000), oznaczające liczbę miast w Bajtocji i liczbę bezpośrednich połączeń kolejowych. Następny wiersz zawiera jedną liczbę całkowitą <em>k</em>&nbsp;(1 &le; <em>k</em> &le; 10<sup>9</sup>) - maksymalne op&oacute;źnienie pociągu zatrzymanego przez kolejarzy. Miasta numerujemy liczbami od 1 do&nbsp;<em>n</em>; kopalnia znajduje się w mieście o numerze 1.</p>

<p>W każdym z następnych&nbsp;<em>m</em>&nbsp;wierszy znajdują się po cztery liczby całkowite <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, <em>w<sub>i</sub></em>, <em>p<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; <em>n</em>, 0 &le; <em>w<sub>i</sub></em>, <em>p<sub>i</sub></em> &le; 10<sup>9</sup>, 0 &le; <em>w<sub>i</sub></em> + <em>p<sub>i</sub></em> &le; 10<sup>9</sup>). Oznaczają one, że zgodnie z rozkładem <em>i</em>-ty pociąg wyjeżdża z miasta <em>a<sub>i</sub></em>&nbsp;punktualnie <em>w<sub>i</sub></em>&nbsp;minut po wschodzie słońca i przyjeżdża do miasta <em>b<sub>i</sub></em>&nbsp;punktualnie <em>p<sub>i</sub></em>&nbsp;minut p&oacute;źniej, tego samego dnia (bajtocki dzień ma 10<sup>9</sup> + 1&nbsp;minut). Czasy wyjazd&oacute;w pociąg&oacute;w z miasta <em>m</em>&nbsp;są nie mniejsze od największego czasu przyjazdu pociągu do <em>m</em>.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą - maksymalne sumaryczne op&oacute;źnienie pociąg&oacute;w, jakie może spowodować strajk kolejarzy.</p>

### 힌트

<p>Zatrzymanie na 3 minuty pociągu jadącego z miasta 1 do miasta 3 spowoduje op&oacute;źnienie tego pociągu oraz dw&oacute;ch pociąg&oacute;w wyruszających z miasta 3.</p>