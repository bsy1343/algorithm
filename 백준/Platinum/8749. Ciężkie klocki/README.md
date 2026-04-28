# [Platinum V] Ciężkie klocki - 8749

[문제 링크](https://www.acmicpc.net/problem/8749)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 분할 정복, 스택

### 문제 설명

<p>Mały Bobbie otrzymał na urodziny zestaw klock&oacute;w. Jego rodzice wiedzieli dobrze, że nie jest to zbyt oryginalny prezent i gdzieś już słyszeli o dzieciach otrzymujących r&oacute;żne odmiany stymulujących intelektualnie klock&oacute;w. Postanowili więc tym razem postawić nie na rozmiar, lecz na wagę. Każdy z fascynujących klock&oacute;w ma swoją wagę, wyrażającą się dodatnią liczbą całkowitą. Żadne dwa klocki nie ważą tyle samo. Na nieszczęście dla Bobbiego, jego rodzice są miłośnikami zagadek logicznych, postanowili więc przerwać jego beztrosko prymitywną zabawę i przygotować dla niego zadanie do wykonania.</p>

<p>Klocki zostały ustawione w rzędzie, jeden obok drugiego. Rodzice wyjaśnili Bobbiemu, że klocki są tak skonstruowane, że jeśli kt&oacute;ryś z nich zostanie popchnięty w jedną ze stron, to przewr&oacute;ci wszystkie lżejsze od niego (na zasadzie domina) po tej stronie, aż do pierwszego klocka cięższego niż ten popchnięty bądź do pierwszego miejsca, gdzie jest przewr&oacute;cony wcześniej klocek. Z uśmiechami na ustach zaproponowali Bobbiemu, że jeśli uda mu się znaleźć spos&oacute;b na przewr&oacute;cenie wszystkich klock&oacute;w w najmniejszej możliwej liczbie &quot;popchnięć&quot;, to będzie m&oacute;gł powr&oacute;cić do swych poprzednich infantylnych zabaw.</p>

<p>Oczywiście Bobbie ani myśli się tym zajmować, woli oglądać wzorki na dywanie. Ale Ty możesz podjąć wspaniały zamiar i pom&oacute;c Bobbiemu poprzez napisanie programu, kt&oacute;ry odnajdzie żądaną liczbę popchnięć klock&oacute;w.</p>

### 입력

<p>Pierwsza linia wejścia zawiera liczbę całkowitą <em>n</em>&nbsp;- liczbę klock&oacute;w. (1 &le; <em>n</em> &le; 1 000 000). W kolejnej linii znajduje się&nbsp;<em>n</em>&nbsp;r&oacute;żnych liczb całkowitych z przedziału od 1&nbsp;do 10<sup>9</sup>&nbsp;- wagi kolejnych klock&oacute;w ustawionych w rzędzie.</p>

### 출력

<p>Jedyna linia wyjścia powinna zawierać jedną liczbę - najmniejszą liczbę popchnięć klock&oacute;w potrzebną do przewr&oacute;cenia ich wszystkich.</p>