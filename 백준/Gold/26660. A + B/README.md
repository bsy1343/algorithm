# [Gold IV] A + B - 26660

[문제 링크](https://www.acmicpc.net/problem/26660)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 20, 정답 비율: 58.824%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Nie wierzcie wszystkiemu, co widzicie w telewizji! Bajtuś skakał ostatnio po kanałach i ujrzał taki oto widok, gdzie ktoś niepoprawnie dodał pisemnie dwie liczby (obrazek po lewej):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26660.%E2%80%85A%E2%80%85%2B%E2%80%85B/b3e0cda3.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26660.%E2%80%85A%E2%80%85%2B%E2%80%85B/b3e0cda3.png" data-original-src="https://upload.acmicpc.net/8ddeeef1-ccfe-4bf8-a5f8-5cbcd401e4b3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 635px; height: 207px;" /></p>

<p>Całkiem spaczyło to jego pojmowanie matematyki i biedak ma teraz problemy z dodawaniem pisemnym dw&oacute;ch liczb. Bajtuś zapisuje je jedna pod drugą, wyr&oacute;wnując je do prawej, po czym na każdej pozycji dodaje do siebie dwie cyfry (na przykład 8 + 8 = 16) i ich sumę zapisuje dokładnie pod nimi w miejscu na wynik. Jeśli na jakiejś pozycji jest tylko jedna cyfra (bo jedna liczba jest kr&oacute;tsza od drugiej), to Bajtuś po prostu przepisuje tę cyfrę do wyniku. Chłopiec oczywiście używa systemu dziesiętnego. Powyżej po prawej stronie możesz zobaczyć dwa dodatkowe przykłady wyliczeń taką metodą.</p>

<p>Pewnego dnia Bajtuś w opisany powyżej spos&oacute;b &bdquo;dodał&rdquo; do siebie dwie nieujemne liczby całkowite a oraz b i otrzymał &bdquo;sumę&rdquo; n. Nieopatrznie rozlał jednak sok na kartkę, na kt&oacute;rej wykonywał działanie, przez co liczby a i b stały się niemożliwe do odczytania! Zastanawia się teraz, ile jest takich uporządkowanych par nieujemnych liczb całkowitych (a, b), kt&oacute;re mogły być napisane na kartce. Pom&oacute;ż mu to ustalić!</p>

### 입력

<p>W pierwszym i jedynym wierszu standardowego wejścia znajduje się jedna liczba całkowita n (1 &le; n &lt; 10<sup>18</sup>).</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca liczbę uporządkowanych par nieujemnych liczb całkowitych (a, b), kt&oacute;re po &bdquo;dodaniu&rdquo; przez Bajtusia dadzą wynik r&oacute;wny n.</p>

### 힌트

<p>Na kartce Bajtusia mogła być jedna z następujących 50 par liczb: (0, 112), (1, 111), (2, 110), (3, 19), (4, 18), (5, 17), (6, 16), (7, 15), (8, 14), (9, 13), (10, 102), (11, 101), (12, 100), (13, 9), (14, 8), (15, 7), (16, 6), (17, 5), (18, 4), (19, 3), (20, 92), (21, 91), (22, 90), (30, 82), (31, 81), (32, 80), (40, 72), (41, 71), (42, 70), (50, 62), (51, 61), (52, 60), (60, 52), (61, 51), (62, 50), (70, 42), (71, 41), (72, 40), (80, 32), (81, 31), (82, 30), (90, 22), (91, 21), (92, 20), (100, 12), (101, 11), (102, 10), (110, 2), (111, 1) oraz (112, 0).</p>

<p>Zauważ, że na przykład pary (3, 19) i (19, 3) liczą się oddzielnie, ponieważ interesują nas uporządkowane pary.</p>