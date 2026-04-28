# [Platinum V] Roman Holidays - 16872

[문제 링크](https://www.acmicpc.net/problem/16872)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 14, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

이분 탐색, 많은 조건 분기, 수학, 파싱, 정렬, 문자열

### 문제 설명

<p>The ancient Romans created many important things: aqueducts, really straight roads, togas, those candles that spout fireworks. But the most useless is Roman numerals, a very awkward way to represent positive integers.</p>

<p>The Roman numeral system uses seven different letters, each representing a different numerical value: the letter I represents the value 1, V 5, X 10, L 50, C 100, D 500 and M 1 000. These can be combined to form the following base values:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16872.%E2%80%85Roman%E2%80%85Holidays/831c95c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16872.%E2%80%85Roman%E2%80%85Holidays/831c95c2.png" data-original-src="https://upload.acmicpc.net/242a902d-b9be-4069-b792-861377b09a0b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 436px; height: 144px;" /></p>

<p>The Roman numeral representation of a non-base value number x is obtained by first breaking up x into a sum of base values and then translating each base value, largest to smallest. When choosing base values you always choose the largest one &le; x first, then the largest one &le; the amount remaining, and so on. Thus 14 = 10 + 4 = XIV, 792 = 700 + 90 + 2 = DCCXCII. Numbers larger than 1 000 use as many M&rsquo;s as necessary. So 2 018 = MMXVIII and 1 000 000 would be a string of one thousand M&rsquo;s (hence the word &ldquo;awkward&rdquo; in the first paragraph).</p>

<p>The Roman numeral representation gives a new way to order the positive integers. We can now order them alphabetically if we treat the Roman representation of each integer as a word. If one word A is a prefix for another word B then A comes first. We&rsquo;ll call this the roman ordering of the positive integers. Thus the first number in roman ordering is C (100 in our system). The next three numbers would be CC, CCC and CCCI, and so on.</p>

<p>Note in roman ordering, all numbers larger than 1 000 would come before any number starting with V or X. Indeed the last number is XXXVIII. In this problem you will be given one or more positive integers and must determine their positions in the roman ordering &ndash; from the front or back as appropriate.</p>

### 입력

<p>Input starts with a positive integer n &le; 100 indicating the number of positive integers to follow, each on a separate line. Each of these remaining numbers will be &le; 10<sup>9</sup>.</p>

### 출력

<p>For each value (other than n), output the position of the integer in the roman ordering, one per line. If the position is relative to the end of the roman ordering, make the integer negative. Thus 38 has roman ordering position &minus;1, 37 has position &minus;2, and so on.</p>