# [Platinum III] Wyliczanka - 26823

[문제 링크](https://www.acmicpc.net/problem/26823)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>Dzieci z Bajtogrodu wymyśliły nową zabawę o nazwie Wyliczanka.</p>

<p>W grze bierze udział N dzieci ponumerowanych liczbami 1, 2, . . . N włącznie, każde dziecko otrzymuje inną liczbę. Następnie dzieci ustawiają się w k&oacute;łko tak, że dziecko o numerze i widzi plecy dziecka o numerze i + 1, przy czym dziecko o numerze N widzi plecy dziecka o numerze 1. Grę rozpoczyna dziecko o numerze 1, podając liczbę całkowitą X<sub>1</sub>. Klepie po plecach dziecko stojące przed nim, klepnięte dziecko klepie plecy następnika i tak dalej, aż nastąpi X<sub>1</sub>-te klepnięcie. Ostatnie klepnięte dziecko odpada z k&oacute;łka, a kolejną liczbę X<sub>2</sub> podaje dziecko, kt&oacute;re jako kolejne byłoby klepnięte. Gra kończy się, gdy pozostanie już tylko jedna osoba w k&oacute;łku. Dla danego N i kolejnych wypowiadanych wartości X<sub>i</sub> określ, jakie dziecko będzie odpadało w kolejnych turach.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 1 000 000). W drugim wierszu wejścia znajduje się ciąg N liczb naturalnych X<sub>i</sub> (1 &le; X<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać ciąg N liczb naturalnych określających numery kolejno odpadających z k&oacute;łka os&oacute;b.</p>