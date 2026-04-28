# [Silver I] ... albo psikus! - 26755

[문제 링크](https://www.acmicpc.net/problem/26755)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 22, 맞힌 사람: 20, 정답 비율: 95.238%

### 분류

수학, 누적 합, 조합론

### 문제 설명

<p>W Bajtocji panuje pewna tradycja, nieznana w innych zakątkach świata &ndash; na początku jesieni dzieci przebierają się w straszne kostiumy i chodzą od domu do domu, zbierając cukierki od mieszkańc&oacute;w.</p>

<p>Bajtek i Bitosia także planują wybrać się na zbieranie cukierk&oacute;w. Mieszkają oni przy bardzo długiej ulicy, kt&oacute;ra zawiera N dom&oacute;w mieszczących się po tej samej stronie drogi i ponumerowanych kolejno od 1 do N. Odwiedzali już tę ulicę wcześniej i wiedzą, dla każdego i = 1,2,...,N, że gdy odwiedzą i-ty dom, dostaną dokładnie Ci cukierk&oacute;w.</p>

<p>Jako że co roku wybuchały między nimi kł&oacute;tnie o ostatniego cukierka, Bajtek i Bitosia postawili tym razem koniecznie zebrać parzystą liczbę cukierk&oacute;w. Ich planowana strategia to wybrać pewne dwa numery dom&oacute;w L i R, po czym odwiedzić wszystkie domy pomiędzy nimi, czyli L, L +1, ..., R&minus;1, R. W ten spos&oacute;b zbiorą dokładnie C<sub>L</sub> +C<sub>L+1</sub> +...+ C<sub>R&minus;1</sub> +C<sub>R</sub>. cukierk&oacute;w.</p>

<p>Na ile r&oacute;żnych sposob&oacute;w Bajtek i Bitosia mogą wybrać domy L i R tak aby zebrać parzystą liczbę cukierk&oacute;w?</p>

### 입력

<p>W pierwszym wierszu wejścia dana jest liczba N (1 &le; N &le; 1 000 000), oznaczająca liczbę dom&oacute;w przy ulicy. W kolejnym wierszu dane jest N liczb C<sub>1</sub>, C<sub>2</sub>, ..., C<sub>N</sub> (1 &le; C<sub>i</sub> &le; 10<sup>9</sup> dla 1 &le; i &le; N), gdzie C<sub>i</sub> oznacza liczbę cukierk&oacute;w, kt&oacute;re dzieci mogą zebrać odwiedzając dom o numerze i.</p>

### 출력

<p>Wypisz jeden wiersz, zawierający liczbę możliwych par numer&oacute;w dom&oacute;w (L,R), dla kt&oacute;rych dzieci zbiorą parzystą liczbę cukierk&oacute;w.</p>