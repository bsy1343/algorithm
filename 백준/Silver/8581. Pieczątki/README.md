# [Silver II] Pieczątki - 8581

[문제 링크](https://www.acmicpc.net/problem/8581)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Bituś od dłuższego czasu bawił się, zamalowując pisakiem niekt&oacute;re pola na papierze w kratkę. Uzyskane w ten spos&oacute;b pikselowe obrazki wieszał nad ł&oacute;żkiem i zapowiedział, że nie przestanie, p&oacute;ki będzie tam jeszcze wolne miejsce.</p>

<p>Jego mama uważała, że zabiera to chłopcu zbyt dużo czasu, więc postanowiła mu pom&oacute;c - przyniosła ze strychu pieczątki, kt&oacute;rymi kiedyś sama się bawiła. Każda taka pieczątka, po przyciśnięciu do kartki, &quot;zamalowywała&quot; jakiś, zawsze taki sam, wz&oacute;r z p&oacute;l. Bitusiowi pieczątki spodobały się, ale nie jest pewien, czy wystarczą do wykonania jego nowego obrazka.</p>

<p>Wiedząc, jak ma wyglądać nowy obrazek oraz znając wzory odciskane przez pieczątki, określ, czy Bituś może go ukończyć bez używania pisaka. Bituś nie obraca pieczątek (patrz drugi test przykładowy). Pamiętaj, że obrazek nie zajmuje całej kartki, ale żadne pole, kt&oacute;re nie należy do obrazka, nie powinno być zamalowane (patrz pierwsze dwa testy przykładowe).</p>

### 입력

<p>W pierwszym wierwszu standardowego wejścia znajdują się wymiary obrazka - dwie liczby: $W$&nbsp;i $S$&nbsp;($1 &le; W, S &le; 100$).</p>

<p>W kolejnych $W$&nbsp;wierszach znajduje się po $S$&nbsp;znak&oacute;w &quot;<code>#</code>&quot; lub &quot;<code>.</code>&quot;, informujących odpowiednio, że dane pole musi być odciśnięte co najmniej raz albo że musi być pozostawione puste.</p>

<p>W następnym wierszu znajduje się jedna liczba $P$&nbsp;($1 &le; P &le; 20$), oznaczająca liczbę pieczątek do dyspozycji Bitusia.</p>

<p>Opis każdej pieczątki jest podobny do opisu obrazka - składa się z dw&oacute;ch liczb: $R$&nbsp;i $C$&nbsp;($1 &le; R, C &le; 10$), oznaczających wymiary pieczątki oraz $R$&nbsp;wierszy po $C$&nbsp;znak&oacute;w &quot;<code>#</code>&quot; lub &quot;<code>.</code>&quot;, oznaczających, że przyłożenie pieczątki w odpowiednim miejscu zamaluje wszystkie pola znajdujące się pod znakami &quot;<code>#</code>&quot;, nie zmieniając stanu tych położonych pod znakami &quot;<code>.</code>&quot;.</p>

### 출력

<p>Na standardowe wyjście należy wypisać jedno słowo - &quot;<code>TAK</code>&quot;, jeśli podane pieczątki wystarczą do namalowania obrazka, &quot;<code>NIE</code>&quot;, w przeciwnym wypadku.</p>