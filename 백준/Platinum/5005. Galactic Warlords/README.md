# [Platinum IV] Galactic Warlords - 5005

[문제 링크](https://www.acmicpc.net/problem/5005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 13, 맞힌 사람: 12, 정답 비율: 40.000%

### 분류

기하학

### 문제 설명

<p>Will the galaxy see peace at last? All the warlords have gathered to divide all of space between themselves. The negotiations have come quite far and the warlords have ﬁnally agreed on a peaceful way of deciding who gets what. The 2-dimensional galactic map must ﬁrst be divided into sectors by splitting it along a set of inﬁnite lines. The warlord with the largest battle ﬂeet will choose one sector, then the warlord with the second largest ﬂeet will choose some other sector and so on, until everyone has gotten a sector. This is then repeated until there are no sectors left.</p>

<p>Different sets of lines have been suggested, and it is up to you to present these alternatives to the meeting. To make sure that there will be peace, you are ready to modify the suggestions slightly. You have some experience with warlords and know that no warlord will settle for less space than anyone else, so for there to be peace, all of them must get the exact same area on the map. Since space is inﬁnite, so is the map. Some sectors will therefore have inﬁnite area, so that is the amount of space everyone will want. How many extra lines will you have to add to make sure each warlord can get at least one sector with inﬁnite area?</p>

### 입력

<p>The ﬁrst line of input contains two positive integers W and N, (1 &le; W, N &le; 100) denoting the number of warlords and the number of lines in the suggested division of space. This is followed by N lines each containing four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub> and y<sub>2</sub>, each with an absolute value no higher than 10 000. This means that one line is intersecting the two points (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) on the galactic map. These two points will not be the same.</p>

### 출력

<p>Output the number of lines you will have to add to this suggestion to satisfy all warlords.</p>