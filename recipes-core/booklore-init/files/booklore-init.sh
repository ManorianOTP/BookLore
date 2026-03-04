#!/bin/sh

### BEGIN INIT INFO
# Provides:          booklore-init
# Required-Start:    $local_fs $syslog
# Default-Start:     5
# Default-Stop:      0 1 6
# Short-Description: BookLore e-reader startup
### END INIT INFO

case "$1" in
    start)
        echo "========================================"
        echo "  BookLore E-Reader OS starting..."
        echo "========================================"
        booklore-hello
        ;;
    stop)
        echo "BookLore shutting down..."
        ;;
    *)
        echo "Usage: $0 {start|stop}"
        exit 1
        ;;
esac

exit 0
