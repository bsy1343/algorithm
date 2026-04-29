# [Platinum V] Wyliczanka - 33821

[문제 링크](https://www.acmicpc.net/problem/33821)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>W przedszkolu Bajtosi jest dużo zabawek i czasami ciężko dziewczynce zdecydować, którą z nich będzie się bawić danego dnia. W celu ułatwienia sobie wyboru, Bajtosia postanowiła użyć wyliczanek.</p>

<p>Jeśli danego dnia chce wybrać jedną z $n$ zabawek, to ustawia je wszystkie w rzędzie i numeruje od $1$ do $n$. Zaczyna od wskazania na jedną z zabawek, a potem recytuje wyliczankę i przy każdej sylabie przechodzi do zabawki poprzedniej lub następnej w rzędzie (w przypadku zabawki $1$ oraz $n$ nie ma wyboru i musi przejść odpowiednio do $2$ oraz $n - 1$). Ostatnią wskazaną zabawką bawi się przez resztę dnia.</p>

<p>Bajtosia w trakcie wyliczanki śledzi, ile razy wskazuje na każdą z zabawek: po skończeniu wyliczanki zabawka $i$-ta została wskazana $a_i$ razy. Sprawdź, czy Bajtosia się nie pomyliła, czyli dla danego ciągu $a_1, a_2, \dots , a_n$ zapamiętanego przez Bajtosię stwierdź, czy istnieje wyliczanka do niego pasująca.</p>

<p>Sytuacja ta powtarzała się przez $t$ dni z różnymi podzbiorami zabawek $i$ różnymi wyliczankami.</p>

### 입력

<p>Pierwszy wiersz zawiera liczbę całkowitą $t$ ($1 ≤ t ≤ 100\, 000$), oznaczającą liczbę dni, w których Bajtosia używała wyliczanek do wyboru zabawki. Następnie jest $t$ opisów poszczególnych dni, jeden za drugim.</p>

<p>Pierwszy wiersz opisu dnia zawiera jedną liczbę całkowitą $n$ ($1 ≤ n ≤ 1\, 000\, 000$), oznaczającą liczbę zabawek uczestniczących tego dnia w wyliczance. Drugi wiersz zawiera ciąg $n$ liczb całkowitych $a_1, a_2, \dots , a_n$ ($0 ≤ a_i ≤ 10^9$), oznaczających ile razy kolejne zabawki zostały wskazane w trakcie wyliczanki według Bajtosi. Możesz założyć, że co najmniej jedna z liczb $a_i$ jest niezerowa.</p>

<p>Suma wszystkich wartości $n$ po wszystkich $t$ dniach nie przekracza $1\, 000\, 000$.</p>

### 출력

<p>Na wyjście należy wypisać $t$ wierszy zawierających jedno ze słów <code>TAK</code> lub <code>NIE</code>. Słowo <code>TAK</code> oznacza, że istnieje wyliczanka pasująca do ciągu zapamiętanego przez Bajtosię, słowo <code>NIE</code> oznacza, że taka wyliczanka nie istnieje.</p>

### 힌트

<p>Pierwszego dnia Bajtosia w trakcie wyliczanki mogła wskazywać kolejno przedmioty $2$, $1$, $2$, $3$, $2$.</p>

<p>Trzeciego dnia użyła krótkiej wyliczanki i zaczęła bawić się pierwszą wskazaną zabawką.</p>

<p>Natomiast piątego mogła wskazać kolejno przedmioty $1$, $2$, $3$, $4$, $3$, $2$, $1$, $2$, $1$.</p>

<p>Dla żadnego z pozostałych dni nie istnieje odpowiednia wyliczanka.</p>