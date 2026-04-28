# [Gold II] Kupiec - 8599

[문제 링크](https://www.acmicpc.net/problem/8599)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

수학, 누적 합

### 문제 설명

<p>Bajtazar jest wędrownym kupcem, kt&oacute;ry przemieszcza się pomiędzy miastami leżącymi wzdłuż linii kolejowej. Jego cel jest prosty: kupić tanio, sprzedać z zyskiem i nie wydać zbyt dużo na podr&oacute;ż.</p>

<p>Wspomniane miasta są ponumerowane od $1$&nbsp;do $n$&nbsp;zgodnie z kolejnością występowania wzdłuż tor&oacute;w. Bajtazar chciałby zarobić możliwie najwięcej na pewnym konkretnym towarze, kt&oacute;rego cenę w każdym mieście zna. Ponadto wie, ile kosztuje przejazd między dowolną parą sąsiadujących miast (droga w okolicy jest tylko jedna, więc bezpośrednio można poruszać się jedynie pomiędzy miastami o numerach $i$&nbsp;oraz $i+1$). Jego zysk to cena, po kt&oacute;rej sprzeda towar, pomniejszona o cenę zakupu i sumaryczny koszt przejazdu. Niestety Bajtazar nie jest zbyt dobry z ekonomii i potrzebuje Twojej pomocy. Napisz program, kt&oacute;ry obliczy maksymalny możliwy zysk w jednej takiej parze transakcji, zakładając, że Bajtazar może rozpocząć i zakończyć podr&oacute;ż w dowolnych miastach.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 1\,000\,000$), oznaczającą liczbę miast. W drugim wierszu znajduje się $n$&nbsp;liczb całkowitych $c_i$&nbsp;($1 &le; c_i &le; 1\,000\,000\,000$) pooddzielanych pojedynczymi odstępami. Są to ceny towaru w kolejnych miastach. Trzeci wiersz zawiera $n-1$&nbsp;liczb całkowitych $p_i$&nbsp;($1 &le; p_i &le;1\,000$&nbsp;dla $i = 1, 2, \dots , n-1$) pooddzielanych pojedynczymi odstępami, oznaczających ceny przejazdu odpowiednio między miastami o numerach $i$&nbsp;oraz $i+1$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście jedną liczbę całkowitą - maksymalny możliwy zysk Bajtazara. Zauważ, że w skrajnym przypadku Bajtazar może kupić i sprzedać towar w tym samym mieście.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Bajtazar kupuje towar w mieście numer 3 (cena: 2), następnie przejeżdża do miasta numer 1 (koszt tego przejazdu to $1+5=6$), gdzie sprzedaje towar w cenie 19. Łączny zysk Bajtazara to: $19-6-2=11$.</p>