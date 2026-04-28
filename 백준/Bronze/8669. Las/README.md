# [Bronze II] Las - 8669

[문제 링크](https://www.acmicpc.net/problem/8669)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 416, 정답: 241, 맞힌 사람: 198, 정답 비율: 59.104%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>W Bajtockim lesie każde drzewo jest oznaczone i zapisane w pewnej bazie danych. Niestety niekt&oacute;re dane uległy zniszczeniu i znamy tylko grubość pnia i rodzaj drzewa. Wiadomo, że por&oacute;wując dwa drzewa tego samego rodzaju, starszym drzewem będzie zawsze drzewo o grubszym pniu. Możemy założyć, że nie ma dw&oacute;ch drzew tego samego rodzaju o tej samej grubości pnia. Chcielibyśmy poznać, ilu jest kandydat&oacute;w na najstarsze drzewo w Bajtockim lesie.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę drzew w Bajtockim lesie. Następnych <em>n</em>&nbsp;wierszy opisuje kolejne drzewa. Każdy wiersz zawiera dwie liczb całkowite <em>g</em>, <em>r</em>&nbsp;(1 &le; <em>g</em> &le; 10<sup>9</sup>, 1 &le; <em>r</em> &le; 10<sup>6</sup>), oznaczające odpowiednio grubość i rodzaj drzewa.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną liczbie kandydat&oacute;w na najstarsze drzewo Bajtocji.</p>