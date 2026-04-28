# [Gold III] KOLINJE - 9628

[문제 링크](https://www.acmicpc.net/problem/9628)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 143, 정답: 60, 맞힌 사람: 50, 정답 비율: 42.017%

### 분류

수학

### 문제 설명

<p>Melita has just returned from the annual pig slaughter. Don&#39;t worry, this is a regular thing in Croatia. The best part was the abundance of food! There was everything, starting from good spicy sausages, ham, black pudding, up to teewurst, top quality bacon and čvarci, all with warm white bread and butter. After these appetizers, it was the perfect time to whip up a deep pot full of sarma (Melita ate twentyish of them) as well as a large platter of fine roast pork, so soft that it almost melts in your mouth. They watered all of this down with copious gulps of the best dry white wine that made them even hungrier.</p>

<p>Butcher Bajs kept his award-winning ham for the very end. N people attented the annual pig slaughter, labeled with numbers from 1 to N. These people already ate a lot of meat: the k th person ate A[k] kilograms of meat so far. Bajs will distribute his ham to the people in the ratio B[1] : B[2] : &hellip; : B[N], exactly in that order, but he doesn&#39;t know the total amount (number of kilos) of ham which he will be distributing yet.</p>

<p>At the end of the slaughter, the Man of the Year will be declared. A ranking list is made according to the total kilos of meat eaten. Bajs impacts directly on this list by choosing the amount of ham to distribute. Although Bajs has been offered bribes many times, he refused each time, saying that he was an honest man who would not hurt a fly.</p>

<p>Bajs cares about order, because he&#39;s a nice gentleman, and wants to have the order of people in the exact form of 1, 2, 3, ..., N, respectively from the one who ate the most kilos of meat to those who ate less, allowing ties between participants. Help Bajs select the total amount of ham that he will distribute (in the ratio mentioned before) to achieve his intention.&nbsp;</p>

### 입력

<p>The first line of input contains an integer N (2 &le; N &le; 1000), the number of competitors for the Man of the Year award.</p>

<p>Each of the following k lines contains integers A[k] i B[k], as mentioned in the text (0 &le; A[k], B[k] &le; 10<sup>6</sup>). At least one of the numbers B[k] will not be equal to 0.&nbsp;</p>

### 출력

<p>The first and only line of output must contain -1 if the required order cannot be achieved. Otherwise, output the required amount of ham in kilos, a real number (rounded up to 12 decimal places) between 0 and 10<sup>7</sup> (inclusive). If there are multiple possible solutions, output any.</p>

### 힌트

<p>Clarification of the first example: 10.5 kilos of ham is distributed in the ratio 1 : 2 : 0, which gives us 3.5, 7 and 0 kilos of ham, respectively. If we add this to the already eaten amount of meat, we conclude that the participants ate 10.5, 10 and 10 kilos in total, which is a valid order.&nbsp;</p>