#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

#define fr( i, a, b, iter ) for( int i( a ), _b( b ); i < _b; i += iter )

int main()
{
	int N;
	int pos;
	cin >> N;
	string s;
	cin >> s;
	string s2 = s;
	string cols = string( "ABCD" );
	cols.erase( int( s[ 0 ] ) - int( 'A' ), 1 );
	cols.erase( int( cols.find( s[ 1 ] ) ), 1 );
	copy( cols.begin(), cols.end(), s2.begin() );
	fr( i, 2, s.size(), 2 ) {
		cols = "ABCD";
		cols.erase( s[ i ] - 'A', 1 );
		cols.erase( cols.find( s[ i + 1 ] ), 1 );
		if( cols[ 0 ] == s2[ i - 1 ] ) {
			reverse( cols.begin(), cols.end() );
		}
		copy( cols.begin(), cols.end(), s2.begin() + i );
	}
	cout << s2 << "\n";

	return 0;
}