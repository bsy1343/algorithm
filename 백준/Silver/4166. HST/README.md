# [Silver IV] HST - 4166

[문제 링크](https://www.acmicpc.net/problem/4166)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 162, 정답: 39, 맞힌 사람: 22, 정답 비율: 19.130%

### 분류

수학, 구현, 자료 구조, 문자열, 집합과 맵, 사칙연산, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>On July 1st, Ontario&#39;s Provincial Sales Tax (PST) was merged with the Federal Goods and Services Tax (GST), creating the Harmonized Sales Tax (HST). This changed the rate of tax Ontarians pay on various items.</p>

<p>Dalton would like to calculate how this change will affect his personal monthly budget.</p>

### 입력

<p>The first line of input contains a single integer, the number of test cases to follow. Each test case begins with a line containing two integers N, M, the number of categories of items and the number of purchases Dalton makes each month, respectively. Each of these integers is between 1 and 100000, inclusive. N lines follow, each describing a category of item. Each of these lines contains a category name, which is a string of at most 30 uppercase letters, followed by three percentages, giving the PST, GST, and HST rate on that category. Each percentage is a number with up to two digits after the decimal point, and each percentage is followed by the % symbol. Each percentage is at least 0% and at most 100%. These lines are followed by M more lines, each describing one of Dalton&#39;s purchases. Each of these lines contains a category name and a price in dollars and cents and prefixed by the \$ symbol. Each such line indicates the amount of pre-tax money that Dalton spends on an item in the specified category. The amount of each tax to be paid on an item is rounded to the nearest cent; if the tax amount is exactly half a cent more than a whole number of cents, it is rounded up to the nearest greater whole number of cents.</p>

### 출력

<p>For each test case, output the difference, in dollars and cents, between the total HST payable and the total sum of PST and GST payable on Dalton&#39;s monthly purchases. If the HST is more than the PST+GST, output a positive amount. If the HST is less than the PST+GST, output a negative amount.</p>