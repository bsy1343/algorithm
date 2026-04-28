# [Gold V] Domino - 8801

[문제 링크](https://www.acmicpc.net/problem/8801)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 13, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

구현, 시뮬레이션, 스위핑

### 문제 설명

<p>Jarek dostał na gwiazdkę zestaw kostek domina o r&oacute;żnych wysokościach i ustawił je w rzędzie, stawiając każde na sztorc.</p>

<p>Jeśli Jarek przewr&oacute;ci w prawo domino o wysokości&nbsp;<strong>H</strong>&nbsp;ustawione na pozycji<strong>&nbsp;X</strong>, spowoduje to przewr&oacute;cenie w prawo wszystkich kostek domina ustawionych na pozycjach&nbsp;<strong>X</strong>+1,&nbsp;<strong>X</strong>+2, ...,<strong>&nbsp;X</strong>+<strong>H</strong>. Analogicznie, jeśli Jarek przewr&oacute;ci w lewo domino o wysokości&nbsp;<strong>H</strong>&nbsp;ustawione na pozycji&nbsp;<strong>X</strong>, spowoduje to przewr&oacute;cenie w lewo wszystkich kostek domina ustawionych na pozycjach&nbsp;<strong>X</strong>-1,&nbsp;<strong>X</strong>-2, ...,&nbsp;<strong>X</strong>-<strong>H</strong>. Kości przewr&oacute;cone przez pierwszy element analogicznie przewracają kolejne.</p>

<p>Znając wysokość i pozycję każdej kostki domina oblicz maksymalną liczbę element&oacute;w kt&oacute;re przewr&oacute;cą się w wyniku przewr&oacute;cenia jednej kostki w dowolną stronę.&nbsp;</p>

### 입력

<p>W pierwszej linii wejścia&nbsp;znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ).</p>

<p>Pierwsza linia pojedynczego zestawu testowego zawiera liczbę naturalną&nbsp;<strong>N&nbsp;</strong>(1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10<sup>5&nbsp;</sup>)&nbsp;oznaczającą liczbę kostek domina w zestawie.&nbsp;W kolejnych&nbsp;<strong>N</strong>&nbsp;liniach znajdują się po dwie liczby naturalne&nbsp;<strong>X</strong>&nbsp;i&nbsp;<strong>H</strong>&nbsp;(1&lt;=&nbsp;<strong>X</strong>,&nbsp;<strong>H</strong>&nbsp;&lt;= 10<sup>9&nbsp;</sup>)&nbsp;oznaczające pozycję i wysokość kolejnych kostek domina. Pozycje kostek są podane w kolejności rosnącej.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać maksymalną liczbę kostek domina jaka może zostać przewr&oacute;cona w wyniku przewr&oacute;cenia jednego elementu.</p>