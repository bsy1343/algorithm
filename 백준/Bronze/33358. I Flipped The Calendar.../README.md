# [Bronze II] I Flipped The Calendar... - 33358

[문제 링크](https://www.acmicpc.net/problem/33358)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 123, 정답: 80, 맞힌 사람: 52, 정답 비율: 59.091%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>While flipping through the calendar, Nikolai wondered: how many rows are in the calendar for a specific year?</p>

<p>The calendar consists of 12 sheets, each corresponding to a month from January to December. Each sheet lists all the days of the respective month. The days on each sheet are arranged in rows by week: the days of one week are in one row, the days of different weeks are in different rows. In this calendar, the week starts on Monday.</p>

<p>For example, if a month has 31 days and the first day of the month is Sunday (as in January 2023), then there will be six rows on the calendar sheet for that month:</p>

<table class="table table-bordered table-center-20 td-center">
	<tbody>
		<tr>
			<td> </td>
			<td> </td>
			<td> </td>
			<td> </td>
			<td> </td>
			<td> </td>
			<td>1</td>
		</tr>
		<tr>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
		</tr>
		<tr>
			<td>9</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
			<td>13</td>
			<td>14</td>
			<td>15</td>
		</tr>
		<tr>
			<td>16</td>
			<td>17</td>
			<td>18</td>
			<td>19</td>
			<td>20</td>
			<td>21</td>
			<td>22</td>
		</tr>
		<tr>
			<td>23</td>
			<td>24</td>
			<td>25</td>
			<td>26</td>
			<td>27</td>
			<td>28</td>
			<td>29</td>
		</tr>
		<tr>
			<td>30</td>
			<td>31</td>
			<td> </td>
			<td> </td>
			<td> </td>
			<td> </td>
			<td> </td>
		</tr>
	</tbody>
</table>

<p>Remember that in a leap year, February has 29 days, and in a non-leap year, it has 28 days. A year is considered a leap year if its number is divisible by 400 or divisible by 4 but not by 100. For example, 2000, 2004, and 2040 are leap years, while 1900, 1982, and 2039 are not.</p>

### 입력

<p>The first line contains the year number $y$ ($1970 \le y \le 2037$).</p>

### 출력

<p>Output the number of rows in the calendar for the given year.</p>