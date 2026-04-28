# [Gold V] Odważniki - 8679

[문제 링크](https://www.acmicpc.net/problem/8679)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 24, 맞힌 사람: 15, 정답 비율: 36.585%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>Bajtek otrzymał na gwiazdkę zestaw składający się z&nbsp;<em>n</em>&nbsp;czarnych odważnik&oacute;w,&nbsp;<em>n</em>&nbsp;szarych odważnik&oacute;w oraz&nbsp;<em>n</em>&nbsp;bardzo lekkich wag szalkowych.</p>

<p>Zachwycony nową zabawką, Bajtek szybko ułożył pewną konstrukcję. Najpierw położył na podłodze wagę, następnie po jednej stronie wagi położył pewien czarny odważnik, a po drugiej następną wagę i tak na kolejnych wagach stawiał z jednej strony kolejne czarne odważniki, a z drugiej kolejne wagi i tak dalej. Na ostatniej, <em>n</em>-tej wadze, położył z jednej strony ostatni czarny odważnik, a drugą stronę pozostawił pustą.</p>

<p>Teraz Bajtek wymyślił pewną łamigł&oacute;wkę. Na ostatnim pustym miejscu można położyć dowolny szary odważnik. Jeśli pewna waga szalkowa będzie wtedy w r&oacute;wnowadze, to można ją wymienić wraz ze wszystkim, co się na niej znajduje, na jeden szary odważnik o tej samej łącznej masie, o ile taki jest dostępny. Zakładamy tu, że masa wag szalkowych jest pomijalnie mała.</p>

<p>Bajtek chce na samym końcu mieć jak najmniej odważnik&oacute;w, aby swoją konstrukcję m&oacute;gł bez problemu przesłać pocztą do swojej przyjaci&oacute;łki Bitoasi. Znajdź najmniejszą liczbę odważnik&oacute;w, jakie Bajtek może pozostawić w konstrukcji.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000) oznaczająca liczbę wag szalkowych. W drugim wierszu znajduje się&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>c<sub>i</sub></em>&nbsp;(1 &le; <em>c<sub>i</sub></em> &le; 10<sup>18</sup>) pooddzielanych pojedynczymi odstępami, oznaczających masy czarnych odważnik&oacute;w stojących na kolejnych wagach. W trzecim wierszu znajduje się <em>n</em>&nbsp;liczb całkowitych <em>s<sub>j</sub></em>&nbsp;(1 &le; <em>s<sub>j</sub></em> &le; 10<sup>18</sup>) pooddzielanych pojedynczymi odstępami, oznaczających masy szarych odważnik&oacute;w.</p>

<p>Możesz założyć, że w testach wartych co najmniej 40&nbsp;punkt&oacute;w, masy odważnik&oacute;w nie przekraczają 1 000 000, oraz zachodzi warunek n &le; 1 000.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie jedną liczbę całkowitą - minimalną liczbę odważnik&oacute;w, jaką można pozostawić w konstrukcji.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/171aa1d5-9881-4dbb-ba41-682a1a876fc7/-/preview/" /></p>