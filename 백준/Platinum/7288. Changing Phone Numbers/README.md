# [Platinum V] Changing Phone Numbers - 7288

[문제 링크](https://www.acmicpc.net/problem/7288)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 오프라인 쿼리, 집합과 맵

### 문제 설명

<p>You are working for OTC, the Olandican Telecommunication Company. Unfortunately, OTC does not decide wisely in assigning telephone numbers to the clients. For example, it did not make a good estimate on demand increase. As a result, it had to increase the number of digits in the local telephone numbers of Oland (the capital) from six to seven, and then again from seven to eight digits.</p>

<p>As usual, a telephone number consists of two parts: an area code, and the local number within that area code. For example, if 021 is the area code of the Oland city, a telephone number in that city may be 0211234567. Note that no area code is the prefix of another area code.</p>

<p>The process of changing telephone numbers is not easy though. It requires updates to several databases of millions of records. Fortunately, these changes follow a limited number of rules as follows:</p>

<ol>
	<li>For all local numbers in a given area code, repeat the ith digit. For example, for the area code 021, repeating the second digit causes the number 0211234567 change to 02112234567.</li>
	<li>For all numbers in a given area code, swap the i th and the (i + 1) th digit. For example, for the area code 021, swapping the second and the third digits causes the number 0211234567 change to 0211324567.</li>
	<li>Change a given area code. For example, changing 021 to 0211 causes the number 0211234567 change to 02111234567.</li>
</ol>

<p>Note that changing area codes in the third rule preserves the property that no area code is the prefix of another. You are to write a program that given the area code information, and the set of all telephone numbers, plus a given set of rules, determine the resulting telephone numbers after the changes.</p>

### 입력

<p>The first part of the input describes the set of area codes. It starts with a line containing a single integer A (1 &le; A &le;&nbsp;1000) , which is the number of area codes in Olandica, followed by A lines of the following form:</p>

<p>area - code &nbsp; area - name</p>

<p>where area - code is a string of at least one, and at most 6&nbsp;digits, and area - name is a string of at least one, and at most 20 letters (both uppercase and lowercase). There are no two lines with the same area-code or area-name.</p>

<p>The second part of the input describes the rules applied by OTC. The first line of this part contains a single integer R (0 &le; R &le; 10000) , the number of rules applied, followed by R lines of the following form:</p>

<p>year &nbsp; rule - info</p>

<p>where year is the year in which the rule is applied. You may assume the rule is applied on the first day of the year, and at most one rule is applied each year. The rule - info part depends on the specific rule applied. The following list shows the rule-info formats corresponding to the rules described in the problem statement:</p>

<ul>
	<li>1 area - name &nbsp;i</li>
	<li>2 area - name &nbsp;i</li>
	<li>3 area - name &nbsp;new - area - code</li>
</ul>

<p>You can assume that input data is consistent; i.e. in the rules section, indices are not out of range, and an area code will never be prefix of another, at any fixed time. The third part of the input consists of several lines of the following form:</p>

<p>year<sub>1 </sub>&nbsp;year<sub>2</sub> &nbsp;number</p>

<p>The query says that in year1 , there was a telephone number number , and asks for that number in year<sub>2</sub> ( year<sub>1 </sub>&le;<sub>&nbsp;</sub>year<sub>2</sub> ). You must change the number according to the rules applied in the years between year<sub>1</sub> + 1 and year<sub>2</sub> in that order. The queries end with a line containing three zeros. The years are positive integers less than 10<sup>9</sup> .</p>

<p>In every line in the input containing more than one data item (number or name), the data items are separated by one or more spaces. There may be arbitrary number of leading or trailing spaces too. Each data item is at least one character. Each line of the input is at most 50 characters.</p>

### 출력

<p>The output contains one line corresponding to each query containing the changed number.</p>