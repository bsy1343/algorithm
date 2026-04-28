# [Platinum I] Watermelons of the Field of Wonder of the Fool's Land - 11820

[문제 링크](https://www.acmicpc.net/problem/11820)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 201, 정답: 15, 맞힌 사람: 13, 정답 비율: 8.904%

### 분류

볼록 껍질을 이용한 최적화

### 문제 설명

<p>The world finanial risis defeated the economis of the Fool&#39;s Land, and Buratino decided to cultivate watermelons for additional inome. Of course, for the business he started to use the famous Field of Wonder. Because of the special diligence (or maybe because of the wonderful features of the Field of Wonder), the speed of growth of each watermelon was not hanged in time, but could be different for different watermelons. Watermelons of the Field of Wonder become very famous and attractive for tourists.</p>

<p>When Buratino noticed that tourists like photos with watermelons, he also introduced the new service for VIP tourists: photo with the heaviest watermelon.</p>

<p>One day he simultaneously measured the weights and the speeds of growth of all watermelons. Then for any K-th day after this day he an compute the weight of any watermelon by the formula W<sub>K</sub> = W<sub>0</sub>+S&middot;K, where W<sub>0</sub> is the initial weight and S is the speed of growth for this watermelon.</p>

<p>Buratino is too lazy to carry out all these computations every day by hand and asks you to help him. Write a program that will find the heaviest watermelon at the given day.</p>

### 입력

<p>First line of input file contains one integer N - the number of watermelons (1 &le; N &le; 10<sup>5</sup>). Each of the next N lines contains two single space separated integers W<sub>0</sub> and S (1 &le; W<sub>0</sub>,S &le; 10<sup>9</sup>) - the initial weight and the speed of growth for the corresponding watermelon.</p>

<p>The next line contains one integer M - the number of days for which you have to find the heaviest watermelon (1 &le; M &le; 10<sup>5</sup>). Each of the last M lines of the input contains one positive integer, indicating day number K (1 &le; K &le; 10<sup>9</sup>) for which you have to answer the task question.</p>

### 출력

<p>Output file should contain M lines - one line for each day in the same order as in the input. On the corresponding line output one integer - the number of the heaviest watermelon for this day. In case when there are several such watermelons, output the minimal number of such watermelon. Watermelons are enumerated from 1 to N in order they appear in the input.</p>