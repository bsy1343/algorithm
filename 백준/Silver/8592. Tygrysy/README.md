# [Silver II] Tygrysy - 8592

[문제 링크](https://www.acmicpc.net/problem/8592)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 19, 맞힌 사람: 15, 정답 비율: 53.571%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Bajtockie tygrysy to niezwykłe zwierzęta, a ich nietypowe zwyczaje od zawsze fascynowały zoolog&oacute;w i matematyk&oacute;w. Ustalono niedawno, że dzielą się one na specyficzne gatunki. Tygrysa nazwiemy $k$-tygrysem, jeśli spotkawszy tygrysa mniejszego co najmniej $k$&nbsp;razy od siebie, zaatakuje go i zje, jednak nie odważy się tknąć żadnego większego tygrysa.</p>

<p>W bajtockim ZOO żyje $n$&nbsp;tygrys&oacute;w. Niestety miejsce w ZOO jest ograniczone, dlatego też dyrektor stwierdził, że trzeba tak przydzielić zwierzęta do wybieg&oacute;w, aby zająć ich jak najmniej. Oczywiście nie można przy tym dopuścić, by jakikolwiek tygrys został pożarty. Dyrektor ma wyraźne problemy z zakwaterowaniem tygrys&oacute;w, zwr&oacute;cił się więc do Ciebie po pomoc.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 500\,000$) - liczbę tygrys&oacute;w w ZOO. Każdy z kolejnych $n$&nbsp;wierszy zawiera opis jednego tygrysa. Opis taki składa się z dw&oacute;ch liczb całkowitych $r_i$&nbsp;oraz $k_i$&nbsp;($1 &le; r_i &le; 1\,000\,000\,000$, $2 &le; k_i &le; 1\,000\,000$), oddzielonych pojedynczym odstępem. Oznaczają one, że $i$-ty tygrys jest $k_i$-tygrysem i ma rozmiar $r_i$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie jedną liczbę całkowitą - najmniejszą liczbę wybieg&oacute;w, do kt&oacute;rych można bezpiecznie przydzielić tygrysy.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;W powyższym przykładzie tygrysy o rozmiarach $28$, $18$, $15$&nbsp;mogą występować na wybiegu number $1$, zaś tygrysy o rozmiarach $10$, $8$&nbsp;mogą zostać pokazane na wybiegu numer $2$.</p>