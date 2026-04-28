# [Platinum II] Stablo u stablu - 16356

[문제 링크](https://www.acmicpc.net/problem/16356)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>Zadano je stablo: neusmjeren i povezan graf s n vrhova i n &minus; 1 bridova. Vrhovi su označeni brojevima 1, 2, . . . , n.</p>

<p>Zadano je q upita. U svakom upitu odabiremo neki podskup vrhova stabla P = {v<sub>1</sub>, v<sub>2</sub>, . . . , v<sub>k</sub>} i pitamo koliko se bridova nalazi u najmanjem razapinjujućem stablu skupa P? Drugim riječima, koliko bridova pripada barem jednom putu između nekih vrhova skupa&nbsp;P? Pronadite odgovore na sve upite.</p>

### 입력

<p>U prvom redu nalazi se prirodan broj n (2 &le; n &le; 1 000 000), broj vrhova stabla. U svakom od sljedećih n &minus; 1 redova nalaze se dva različita prirodna broja a, b (1 &le; a, b &le; n) koji označavaju da su vrhovi a i b povezani bridom.</p>

<p>U sljedećem redu nalazi se prirodan broj q (1 &le; q &le; 60 000), broj upita. U svakom od sljedećih q redova nalazi se najprije prirodan broj k (k &ge; 2), veličina skupa, a potom k različitih prirodnih brojeva između&nbsp;1 i n koji predstavljaju vrhove skupa iz teksta zadatka. Zbroj veličina k za sve upite bit će najvi&scaron;e 300 000.</p>

### 출력

<p>Za svaki upit u zaseban redak ispi&scaron;ite traženi broj bridova.</p>