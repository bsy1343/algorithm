# [Gold III] Speedrun - 26780

[문제 링크](https://www.acmicpc.net/problem/26780)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

함수형 그래프, 그래프 이론

### 문제 설명

<p>Bajtosia ma w końcu chwilę wolnego i chce pograć w grę komputerową. Gra składa się z N poziom&oacute;w ponumerowanych od 1 do N. Recenzenci bardzo chwalą nieliniową fabułę gry. Gracz może zacząć grę na dowolnym, wybranym przez siebie poziomie (od 1 do N). Dodatkowo, dla każdego poziomu i ustalony jest poziom T<sub>i</sub> , kt&oacute;ry po nim następuje. Gracz wygrywa w momencie, kiedy trafia do już ukończonego poziomu. Autorzy gry nie chcieli przecież, aby gra była nudna i powtarzalna. Zauważ, że przy takich warunkach nie jest konieczne ukończenie wszystkich poziom&oacute;w do wygrania gry. Gracz w ten spos&oacute;b nie będzie się nudził przy kolejnej przygodzie.</p>

<p>Bajtosia pasjonuje się speedrunningiem &ndash; aktywnością, kt&oacute;ra polega na jak najszybszym przechodzeniu gier. Bajtosia jest w stanie przejść każdy poziom gry. Pokonanie poziomu numer i zajmuje jej dokładnie i minut. Dalej jednak nie wie jak najszybciej może wygrać.</p>

<p>Pom&oacute;ż jej i napisz program, kt&oacute;ry wczyta opis gry, wyliczy minimalną liczbę minut potrzebną na wygranie i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 100 000), określająca liczbę poziom&oacute;w gry. W drugim (ostatnim) wierszu wejścia znajduje się opis tych poziom&oacute;w: N liczb całkowitych T<sub>i</sub> (1 &le; T<sub>i</sub> &le; N), pooddzielanych pojedynczymi odstępami: i-ta liczba określa, że po przejściu poziomu i trafia się do poziomu T<sub>i</sub>.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną liczbę całkowitą &ndash; minimalną liczbę minut, kt&oacute;re potrzebuje Bajtosia aby wygrać.</p>