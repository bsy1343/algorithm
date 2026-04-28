# [Gold I] Stabilny ciąg - 26734

[문제 링크](https://www.acmicpc.net/problem/26734)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 21, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

수학, 다이나믹 프로그래밍, 자료 구조, 정수론, 집합과 맵, 해시를 사용한 집합과 맵, 소수 판정

### 문제 설명

<p>Ciąg liczb naturalnych nazywamy stabilnym, jeśli każde dwa jego kolejne elementy mają największy wsp&oacute;lny dzielnik (NWD) większy od 1.</p>

<p>Przykładowo ciąg (5, 15, 9, 21, 14) jest stabilny, ponieważ NWD(5, 15) = 5 &gt; 1, NWD(15, 9) = 3 &gt; 1, NWD(9, 21) = 3 &gt; 1 oraz NWD(21, 14) = 7 &gt; 1. Za to bardzo podobny ciąg siedmioelementowy (5, 15, 7, 9, 21, 8, 14) stabilny nie jest, bo np. NWD(15, 7) = 1.</p>

<p>Mając dany ciąg liczb naturalnych, usuń z niego niekt&oacute;re elementy (być może zero) tak, aby pozostały ciąg był stabilny. Zr&oacute;b to tak, żeby jak najwięcej element&oacute;w pozostało w ciągu. Jako odpowiedź wypisz numery pozostawionych element&oacute;w, czyli ich pozycje w wejściowym ciągu. Na przykład z ciągu (2, 5, 6, 3) można pozostawić trzy elementy: pierwszy, trzeci i czwarty.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 30 000) określająca liczbę element&oacute;w ciągu.</p>

<p>W drugim (ostatnim) wierszu wejścia znajduje się ciąg N liczb naturalnych A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>8</sup>), pooddzielanych pojedynczymi odstępami. Są to elementy danego ciągu.</p>

### 출력

<p>W pierwszym wierszu wyjścia należy wypisać jedną liczbę naturalną R &ndash; największą liczbę element&oacute;w, kt&oacute;re można pozostawić z wejściowego ciągu tak, aby otrzymać ciąg stabilny. W drugim wierszu wyjścia należy wypisać rosnący ciąg Rliczb naturalnych &ndash; numery element&oacute;w, kt&oacute;re należy pozostawić. Jeśli istnieje więcej niż jedna prawidłowa możliwość pozostawienia R element&oacute;w, możesz wypisać dowolną z nich.</p>

<p>Elementy wejściowego ciągu numerowane są kolejnymi liczbami naturalnymi od 1 do N włącznie.</p>