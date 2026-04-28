# [Silver III] Inventory Maintenance - 6485

[문제 링크](https://www.acmicpc.net/problem/6485)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 13, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 집합과 맵

### 문제 설명

<p>Madam Phoenix (from Problem A) hasn&#39;t been too successful with her new numerology business, so she&#39;s moving to the southwest to open a &quot;Fun In The Sun&quot; store selling sunglasses, sunscreen, and other such items. Even though she didn&#39;t make a profit using your last program, she&#39;s decided to employ you again to write an inventory program for her new store. Here&#39;s how it will work.</p>

<p>Eachd &quot;activity&quot; your program is to process will appear as a separate line in the input file. Then end of the input is marked by a line containing an asterisk in column one; no other activity lines will be so marked. Activity lines begin with a lower-case keyword identifying he action to be performed. The names of the items in her inventory are case sensitive, and each contains no more than ten non-blank characters. All fields in the activity lines are separated by blanks, and Madam Phoenix guarantees you that there will be no errors in the input. Here are the various types of activity lines your program is to process.</p>

<ul>
	<li>new item-name item-cost item-selling-price
	<ul>
		<li>This line adds a new item (not previously carried in the store) to the potential inventory. The item-cost and item-selling-price are given as normal dollar amounts, without the dollar sign. That is, they will contain one or more decimal digits, a decimal point, and two more decimal digits. Note that this activity line doesn&#39;t actually result in a change n the inventory, but is used in anticipation of adding units of the new item to the store&#39;s offerings. item-cost is what Madam phoenix pays for each unit of the item, and item-selling-price is the price for which she sells the item. There will be no more than 100 total item-names ever included in the the list of items. item-cost and item-selling-price will never be larger than 100.00.</li>
	</ul>
	</li>
	<li>delete item-name
	<ul>
		<li>If an item isn&#39;t selling well, Madam Phoenix can remove it from the inventory by including this line in the program input. All units of item-name in the inventory are written off as a loss.</li>
	</ul>
	</li>
	<li>buy item-name quantity
	<ul>
		<li>When Madam Phoenix buys some units (at the unit-cost, previously indicated) of an item-name to offer for sale, she&#39;ll indicate that with one of these lines in the program input. quantity indicates the number of units she purchased. The quantity she purchases will never be larger than 5000 at a time, but the number of units in the inventory may be as large as 10,000.</li>
	</ul>
	</li>
	<li>sell item-name quantity
	<ul>
		<li>When one or more units of an item are sold, that fact is recorded by placing one of these lines in the input. quantity indicates the number of units sold (at the item-selling-price previously indicated). Obviously, the quantity sold cannot exceed the number of items in stock.</li>
	</ul>
	</li>
	<li>report
	<ul>
		<li>This line in the input requests a report. This is the only input line for which output is expected. Your program will display columns, with suitable headings, showing item-name, the buying price, the selling price, the number of units in the inventory, and the value of the units in the inventory (that is, the product of the number of units in the inventory and the buying price). The lines in the report should be sorted in alphabetical order on item name.. Following the last item the total value of all units in the inventory should be displayed. Then finally, a line should appear showing the total profit since the last report was issued. Profit is defined as total sales, less the cost of the items sold, less the cost of items written off (by the delete activity). The sample output shown illustrates the desired format for the report. All numbers in the report must naturally be exact.</li>
	</ul>
	</li>
</ul>

### 입력



### 출력

