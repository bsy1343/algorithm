# [Gold IV] Inwestycja - 8564

[문제 링크](https://www.acmicpc.net/problem/8564)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 39, 맞힌 사람: 34, 정답 비율: 77.273%

### 분류

다이나믹 프로그래밍, 그래프 이론, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Sieć komputerowa Bajtelandii składa się z <em>n</em>&nbsp;węzł&oacute;w połączonych światłowodami. Sieć światłowod&oacute;w nie jest zbyt gęsta. Umożliwia nawiązanie połączenia (być może pośredniego) pomiędzy dowolnymi dwoma węzłami w sieci tylko w jeden spos&oacute;b. To powoduje, że na niekt&oacute;rych łączach powstaje spory tłok i następują duże op&oacute;źnienia w przesyłaniu informacji. Natomiast ruch w sieci jest dość spory i w zasadzie jednakowo natężony, tzn. w każdej jednostce czasu, każde dwa wezły wymieniają pomiędzy sobą pakiet informacji.&nbsp;<b><i>Obciążeniem</i></b>&nbsp;łącza nazwiemy liczbę pakiet&oacute;w przesyłanych przez to łącze w jednej jednostce czasu. (Zauważmy, że obciążenie łącza, to liczba węzł&oacute;w znajdujących się po jednej stronie łącza pomnożona przez liczbę węzł&oacute;w położonych po drugiej stronie łącza.) Firma zarządzająca siecią zastanawia się, czy obciążenie sieci jest na tyle duże, by konieczna była modernizacja lub rozbudowa sieci. W tym celu chciałaby się dowiedzieć, jakie jest największe obciążenie łącza w sieci.</p>

<p>Napisz program, kt&oacute;ry obliczy, ile wynosi obciążenie najbardziej obciążonego łącza w sieci.</p>

### 입력

<p>Program powinien czytać dane z wejścia standardowego. W pierwszym wierszu podana jest liczba <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000), kt&oacute;ra oznacza liczbę węzł&oacute;w w sieci. W kolejnych <em>n</em> - 1&nbsp;wierszach opisane są łącza sieci, po jednym w wierszu. Opis łącza składa się z dw&oacute;ch liczb oddzielonych spacją; liczby te oznaczają numery węzł&oacute;w, pomiędzy kt&oacute;rymi przebiega łącze.</p>

### 출력

<p>Program powinien pisać wynik na wyjście standardowe. Wynikiem powinna być jedna liczba oznaczająca obciążenie najbardziej obciążonego łącza w sieci.</p>