# [Platinum IV] Passport Control Gates - 18337

[문제 링크](https://www.acmicpc.net/problem/18337)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

애드 혹, 해 구성하기, 그리디 알고리즘

### 문제 설명

<p>Everland and Neverland are two neighboring countries, and a huge number of Everlandian tourists visit Neverland every year. The governments want to analyze the passport control process in the border of Neverland and Everland, and need your help!</p>

<p>In the border, tourists stand in q queues for their passport check, and there are q + 1 passport control gates. If we number the gates from 0 to q and number the queues from 0 to q &minus; 1, the tourists standing in queue i can only pass through gates i or i + 1.</p>

<p>Whenever gate i opens, if one of the queues i and i &minus; 1 is empty or non-existent, the tourist at the front of the other queue passes through the gate. If both queues i and i &minus; 1 are non-empty, the older tourist between the ones at the front of two queues passes through the gate. It is assumed that no two gates open at the same time.</p>

<p>We have a picture of n tourists standing in queues; waiting for the gates to open. Also, we have another picture that has been taken a while later, that some of the tourists from the first picture have passed through the gates. The tourists in the pictures are numbered from 0 to n&minus;1, in the order of their ages such that the person number 0 is the youngest and the person number n&minus;1 is the oldest. The picture below shows the first four configurations of the tourists in the first sample.</p>

<p>You are asked to find any valid sequence of gates&rsquo; opening that might have happened between the times the two pictures were taken, or claim that it is impossible. A gate can be opened multiple times in the sequence.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18337.%E2%80%85Passport%E2%80%85Control%E2%80%85Gates/ce214ad1.png" data-original-src="https://upload.acmicpc.net/6b6bd9d1-ae71-4d9b-b25a-7d7a95b339eb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 539px; height: 426px;" /></p>

### 입력

<p>The first line of the input contains two integers q (1 ⩽ q ⩽ 100 000), the number of queues, and n (0 ⩽ n ⩽ 100 000), the number of tourists in the first picture. The i-th line of the next following q lines describes queue i &minus; 1 in the first picture. Each queue description starts with a number k (0 ⩽ k ⩽ n) that shows the size of the queue, followed by k integers that indicate the tourist numbers in that queue, from the back to the front. The tourist numbers are unique and non-negative integers less than n. In the next following q lines the description of the second picture appears in the same format.</p>

### 출력

<p>If there is no valid sequence, print Impossible. If there are valid sequences, output any of them in the following format. Print the length of the sequence in the first line and the sequence itself in the second line. In your sequence, every time any gate opens, there must be at least one tourist waiting for it.</p>