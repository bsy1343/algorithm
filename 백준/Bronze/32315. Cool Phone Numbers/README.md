# [Bronze II] Cool Phone Numbers - 32315

[문제 링크](https://www.acmicpc.net/problem/32315)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 150, 정답: 128, 맞힌 사람: 110, 정답 비율: 84.615%

### 분류

구현

### 문제 설명

<p>Phone numbers in USA are of the form ddd-ddd-dddd, i.e., 10 digits. In general, the fewer distinct digits in a phone number, the easier it is to remember the number. As a result, phone numbers with repeating digits are more popular.</p>

<p>Given a phone number, determine how many distinct digits there are in the number.</p>

### 입력

<p>There is only one input line; it provides the phone number using the above format. The input starts in column 1 and ends in column 12 (10 digits and 2 hyphens).</p>

### 출력

<p>Print 1-10 (the number of distinct digits) as follows:</p>

<ul>
	<li>1 &ndash; if all ten digits are the same, i.e., only one digit in the number, e.g., 888-888-8888</li>
	<li>2 &ndash; if only two different digits in the number, e.g., 757-577-7577</li>
	<li>3 &ndash; if only three different digits in the number</li>
	<li>4 &ndash; if only four different digits in the number</li>
	<li>5 &ndash; if &hellip;</li>
	<li>&hellip;</li>
	<li>10 &ndash; if ten different digits in the number, e.g., 246-189-0537</li>
</ul>