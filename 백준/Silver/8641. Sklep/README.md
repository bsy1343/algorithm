# [Silver IV] Sklep - 8641

[문제 링크](https://www.acmicpc.net/problem/8641)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 134, 정답: 93, 맞힌 사람: 57, 정답 비율: 68.675%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Małgosia prowadzi swoją własną działalność gospodarczą - jest właścicielką sklepu. W każdy poniedziałek otrzymuje nową dostawę z magazynu. Aby nie mylić się w księgowości, Gosia ponumerowała wszystkie znajdujące się w sklepie artykuły. Z każda˛ dostawą sporządzany jest raport - lista z informacją o konkretnej paczce: numer produktu i jego ilość. Wycieńczona pracą właścicielka nie ma już sił na szybkie rozliczenie dostawcy z zam&oacute;wienia. W takim momencie zwraca się do Ciebie, zaufanego informatyka, z prośbą o pomoc.</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis raportu,</li>
	<li>podsumuje zam&oacute;wienie,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu znajduje się liczba $N$&nbsp;($1 &le; N &le; 1\,000\,000$), oznaczająca ilość wierszy w raporcie. W każdej z następnych $N$&nbsp;linii zapisano dwie liczby $A$&nbsp;i $K$&nbsp;($1 &le; A &le; 10^9$,$1 &le; K &le; 100$) oznaczające kolejno numer produktu oraz jego ilość.</p>

### 출력

<p>W pierwszym wierszu powinna się znaleźć liczba P określająca ilość r&oacute;żnych produkt&oacute;w przywiezionych tego dnia do sklepu. Każda z kolejnych $P$&nbsp;linii zawiera dwie liczby $A$&nbsp;i $S$, gdzie $A$&nbsp;to numer produktu, zaś $S$&nbsp;to sumaryczna ilość jaka wpłynęła tego dnia do sklepu (możesz założyć, że liczba $S$&nbsp;nie przekroczy wartości $2^{31}-1$). Kolejne numery produkt&oacute;w powinny występować w takiej samej kolejności, w jakiej pojawiały się na wejściu.</p>