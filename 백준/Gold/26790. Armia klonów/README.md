# [Gold III] Armia klonów - 26790

[문제 링크](https://www.acmicpc.net/problem/26790)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

수학, 그리디 알고리즘, 브루트포스 알고리즘, 이분 탐색

### 문제 설명

<p>Bajtazar, generał armii Republiki Bajtockiej, stanął przed kolejnym wyzwaniem. Według doniesień wywiadu, Republika ma niebawem zostać zaatakowana przez siły wrogiej Federacji Bitockiej. Sytuacja wydaje się dramatyczna, ponieważ potężna armia Federacji liczy aż n robot&oacute;w bojowych, podczas gdy Republika dysponuje tylko jednym robotem. Na szczęście Bajtazar kupił ostatnio bardzo wydajną i dokładną drukarkę tr&oacute;jwymiarową. Maszyna może zeskanować i wprowadzić do wbudowanej pamięci całą bajtocką armię (ta operacja zajmuje zawsze a godzin &ndash; niezależnie od wielkości armii). Może r&oacute;wnież wydrukować zawartość wbudowanej pamięci, kt&oacute;ra to operacja zajmuje zawsze b godzin. Po jednej operacji skanowania można wykonać wiele operacji drukowania.</p>

<p>Bajtazar zastanawia się teraz, ile potrzebuje czasu, aby liczebność jego armii (z uwzględnieniem oryginalnego robota) przewyższyła liczebność armii Federacji Bitockiej. Pom&oacute;ż mu w tym zadaniu.</p>

### 입력

<p>Pierwszy i jedyny wiersz wejścia zawiera trzy liczby całkowite: n, a i b (1 &le; n &le; 10<sup>18</sup>, 1 &le; a, b &le; 10<sup>9</sup>) oznaczające liczebność armii Federacji i parametry drukarki Bajtazara.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą t oznaczającą minimalną liczbę godzin potrzebną do wydrukowania co najmniej n nowych robot&oacute;w.</p>

### 힌트

<p>Wyjaśnienie przykładu: Potrzeba co najmniej 8 godzin, żeby uzyskać łącznie co najmniej 9 robot&oacute;w. Na początku trzeba zeskanować robota, co zajmuje 2 godziny. Następnie należy dwukrotnie wydrukować zawartość pamięci, co zajmuje kolejne 2 godziny i zwiększa stan armii do 3 robot&oacute;w. Wtedy należy jeszcze raz zeskanować całą armię i dwukrotnie wydrukować zawartość pamięci, co zajmuje w sumie 4 godziny i zwiększa liczebność armii do 9. W ten spos&oacute;b po 8 godzinach powstaje 8 nowych robot&oacute;w, przy czym na koniec w pamięci drukarki znajduje się skan 3 robot&oacute;w.</p>